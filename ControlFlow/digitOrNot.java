import java.util.Scanner;

public class digitOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a digit: ");
        String input = scanner.nextLine();

        if(input.length() == 1) {
            char ch = input.charAt(0);
            if(ch >= '0' && ch <= '9') {
                System.out.println("The input is a digit.");
            }
            else {
                System.out.println("The input is not a digit.");
            }
        } 
        else {
            System.out.println("Please enter a single character.");
        }
        scanner.close();
        }
       
    }

