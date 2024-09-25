import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Subject subject = new Subject();
        addObservers(subject);
        showMenu(subject);
        scanner.close();
    }

    private static void addObservers(Subject subject) {
        subject.addObserver(new ConcreteObserver("Observer 1"));
        subject.addObserver(new ConcreteObserver("Observer 2"));
    }

    private static void showMenu(Subject subject) {
        System.out.println("\n--- Observer Pattern Menu ---");
        System.out.println("1. Set message");
        System.out.println("2. Exit");
        System.out.print("Choose an option: ");

        int choice = getUserChoice(2);

        switch (choice) {
            case 1:
                setMessage(subject);
                showMenu(subject);
                break;
            case 2:
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

    private static void setMessage(Subject subject) {
        System.out.print("Enter the message: ");
        String message = scanner.nextLine().trim();
        if (!message.isEmpty()) {
            subject.setMessage(message);
            logger.log(Level.INFO, "Message set to: {0}", message);
        } else {
            System.out.println("Message cannot be empty.");
        }
    }
}
