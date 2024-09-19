package Arrays;
import java.util.Arrays;
/**
 * 20) Program to print the elements of an array in reverse order
 */
public class ReverseOrder {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        System.out.println("Orignal Array >>> " + Arrays.toString(array));;
        reverse(array);
    }

    public static void reverse(int[] array) {
        int size = array.length - 1;
        int [] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[size--] = array[i];
        }
        System.out.println("Reverse order >>> " + Arrays.toString(temp));
    }
}
