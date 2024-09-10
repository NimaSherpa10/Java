package Loops;
import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check palindrome");

        int number = sc.nextInt();
        int temp = number;
        int reversed = 0;
        for(int i = temp; i > 0; i /= 10) {
            int last_digit = i % 10;
            reversed = reversed * 10 + last_digit;

        }
       

        if(reversed == number) {
            System.out.println("The given number is palindrome");
        }
        else {
            System.out.println("The given number is not palindrome");
        }
        sc.close();
    }
}
