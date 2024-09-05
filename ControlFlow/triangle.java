import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the three sides of the triangle
        System.out.print("Enter the length of the first side: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter the length of the second side: ");
        int side2 = scanner.nextInt();

        System.out.print("Enter the length of the third side: ");
        int side3 = scanner.nextInt();

        // Check if the inputs form a valid triangle
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is an equilateral triangle.");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("The triangle is an isosceles triangle.");
            } else {
                System.out.println("The triangle is a scalene triangle.");
            }
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        scanner.close();
    }
}
