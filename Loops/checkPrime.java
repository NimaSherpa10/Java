package Loops;
import java.util.Scanner;
public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();
        if(num <= 0) {
            System.out.println("Please enter positive number.");
        }
        else{
            boolean check = true;
            for(int i = 2; i < num/2; i++) {
                if(num % i == 0) {
                    check = false;
                    break;
                }
            }
            if(check) {
                System.out.println(num + " is a prime number");
            }
            else {
                System.out.println(num + " is not prime number");
            }
        }
    }
}
