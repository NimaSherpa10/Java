public class checkCase {
    public static void main(String[] args) {
        char ch = 'A';  
        check(ch);
    }

    public static void check(char input) {
        if (input >= 'A' && input <= 'Z') {
            System.out.println("Input is an uppercase letter.");
        } else if (input >= 'a' && input <= 'z') {
            System.out.println("Input is a lowercase letter.");
        } else {
            System.out.println("Invalid entry, please enter an alphabetic character.");
        }
    }
}
