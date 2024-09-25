import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        showMenu(audioPlayer);
        scanner.close();
    }

    private static void showMenu(AudioPlayer audioPlayer) {
        System.out.println("\n--- Audio Player Menu ---");
        System.out.println("1. Play audio");
        System.out.println("2. Exit");
        System.out.print("Choose an option: ");

        int choice = getUserChoice(2);

        switch (choice) {
            case 1:
                playAudio(audioPlayer);
                showMenu(audioPlayer);
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

    private static void playAudio(AudioPlayer audioPlayer) {
        System.out.print("Enter the audio type (mp3, vlc, mp4) or 'exit' to return to the menu: ");
        String audioType = scanner.nextLine().trim().toLowerCase();

        if (audioType.equals("exit")) {
            System.out.println("Returning to menu...");
            return;
        }

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine().trim();

        if (fileName.isEmpty()) {
            System.out.println("File name cannot be empty.");
            return; 
        }

        audioPlayer.play(audioType, fileName);
        logger.log(Level.INFO, "Played {0} file: {1}", new Object[]{audioType, fileName});
    }
}
