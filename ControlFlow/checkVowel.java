import java.util.Scanner;

public class checkVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);  // Read a single character input
        
        check(ch);

        scanner.close();
    }

    public static void check(char input) {
        // Check if the input is a vowel
        if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u' || 
            input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U') {
            System.out.println("Input is a vowel");
        } else if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')) {
            // Check if the input is a consonant (any letter that is not a vowel)
            System.out.println("Input is a consonant");
        } else {
            // Handle non-alphabet characters
            System.out.println("Invalid input, not an alphabet character");
        }
    }

}
