package Arrays;
import java.util.Arrays;
/**
 * 17) Swap three numbers with tempary variable
 */
public class SwapThreeNumbers {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;
        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        int temp = a;
        a = b;
        b = c;
        c  = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
