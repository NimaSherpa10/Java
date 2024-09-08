package Loops;
import java.util.Scanner;
public class checkPerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i < n; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        if(sum == n) {
            System.out.println("It is perfect Number");
        }
        else{
            System.out.println("This is not perfect number");
        }

    }
}
