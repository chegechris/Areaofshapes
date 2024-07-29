import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the radius: ");
            double radius = scanner.nextDouble();
            double area = Math.PI * (radius * radius);
            System.out.println("The area of the circle is: " + area);
        } else if (choice == 2) {
            System.out.print("Enter the length: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width: ");
            double width = scanner.nextDouble();
            double area = length * width;
            System.out.println("The area of the rectangle is: " + area);
        } else if (choice == 3) {
            System.out.print("Enter the base: ");
            double base = scanner.nextDouble();
            System.out.print("Enter the height: ");
            double height = scanner.nextDouble();
            double area = 0.5 * base * height;
            System.out.println("The area of the triangle is: " + area);
        } else {
            System.out.println("Invalid choice");
        }
    }
}