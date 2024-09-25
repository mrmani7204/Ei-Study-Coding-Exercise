import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        showMenu(singleton);
        scanner.close();
    }

    private static void showMenu(Singleton singleton) {
        System.out.println("\n--- Singleton Pattern Menu ---");
        System.out.println("1. Show Singleton Message");
        System.out.println("2. Exit");
        System.out.print("Choose an option: ");

        int choice = getUserChoice(2);

        switch (choice) {
            case 1:
                singleton.showMessage();
                logger.log(Level.INFO, "Displayed singleton message.");
                showMenu(singleton); 
                break;
            case 2:
                logger.log(Level.INFO, "User exited the application.");
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                showMenu(singleton); 
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
