import java.util.Scanner;
public class checkInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter a character >> ");
        String input = scanner.nextLine();

        if (input.length() == 1) {
            char ch = input.charAt(0);

            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                System.out.println("The input is an alphabet.");
            } else if (ch >= '0' && ch <= '9') {
                System.out.println("The input is a digit.");
            } else {
                System.out.println("The input is a special character.");
            }
        } else {
            System.out.println("Please enter a single character.");
        }

        scanner.close();
    }
}
