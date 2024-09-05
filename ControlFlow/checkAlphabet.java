import java.util.Scanner;

public class checkAlphabet {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        String input = scanner.nextLine();

        if (input.length() == 1) {
            char ch = input.charAt(0);
            
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                System.out.println("The input is an alphabet.");
            } else {
                System.out.println("The input is not an alphabet.");
            }
        } else {
            System.out.println("Please enter a single character.");
        }

        scanner.close();
    }
}
