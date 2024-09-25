import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Light light = new Light();
        RemoteControl remote = new RemoteControl();
        showMenu(remote, light);
        scanner.close();
    }

    private static void showMenu(RemoteControl remote, Light light) {
        System.out.println("\n--- Command Pattern Menu ---");
        System.out.println("1. Turn Light ON");
        System.out.println("2. Turn Light OFF");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");

        int choice = getUserChoice(3);

        switch (choice) {
            case 1:
                remote.setCommand(new LightOnCommand(light));
                remote.pressButton();
                logger.log(Level.INFO, "Light turned ON");
                showMenu(remote, light);
                break;
            case 2:
                remote.setCommand(new LightOffCommand(light));
                remote.pressButton();
                logger.log(Level.INFO, "Light turned OFF");
                showMenu(remote, light);
                break;
            case 3:
                System.out.println("Exiting...");
                logger.log(Level.INFO, "User exited the application.");
                break;
            default:
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
