import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    private static Scanner scanner = new Scanner(System.in);
    private static Coffee coffee;

    public static void main(String[] args) {
        coffee = new SimpleCoffee(); // Start with a simple coffee
        showMenu();
        scanner.close();
    }

    private static void showMenu() {
        System.out.println("\n--- Coffee Order Menu ---");
        System.out.println("1. Add Milk");
        System.out.println("2. Show Coffee Description and Cost");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");

        int choice = getUserChoice(3);
        handleUserChoice(choice);
    }

    private static void handleUserChoice(int choice) {
        switch (choice) {
            case 1:
                coffee = new MilkDecorator(coffee);
                logger.log(Level.INFO, "Milk added to coffee.");
                System.out.println("Milk has been added to your coffee.");
                showMenu(); // Recursive call to show menu again
                break;
            case 2:
                System.out.println(coffee.getDescription() + " costs $" + coffee.getCost());
                logger.log(Level.INFO, "Displayed coffee description and cost.");
                showMenu(); // Recursive call to show menu again
                break;
            case 3:
                logger.log(Level.INFO, "User exited the application.");
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                showMenu(); // Recursive call to show menu again
                break;
        }
    }

    private static int getUserChoice(int max) {
        int choice = -1;
        while (choice < 1 || choice > max) {
            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and " + max + ".");
                logger.log(Level.SEVERE, "Invalid input: {0}", e.getMessage());
            }
        }
        return choice;
    }
}
