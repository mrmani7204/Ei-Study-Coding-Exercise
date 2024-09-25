import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter shape type (CIRCLE/SQUARE): ");
        String shapeType = scanner.nextLine().trim().toUpperCase();

        Shape shape = shapeFactory.getShape(shapeType);
        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Invalid shape type.");
        }

        scanner.close();
    }
}
