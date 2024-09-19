package Arrays;
import java.util.Arrays;

/**
 * 18) Program to copy all the elements of one array into another array
 */

public class copyArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        System.out.println("Orignal Array >>> " + Arrays.toString(array));
        int[] copy = copy(array);
        System.out.println("Copied Array >>> " + Arrays.toString(copy));
    }

    public static int[] copy(int[] array) {
        int size = array.length;
        int [] temp  = new int[size];
        for(int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        return temp;
    }
}
