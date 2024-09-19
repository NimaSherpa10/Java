package Arrays;
import java.util.Arrays;
/**
 * 22) Program to print the elements of an array present on odd position
 */
public class OddPostion {
    public static void main(String[] args) {
        int [] array = {2,3,4,5,6,7,8,9,10};
        System.out.println("Orignal Array >>> " + Arrays.toString(array));
        PrintOddPosition(array);
    }

    public static void PrintOddPosition(int[] array) {
        int size = array.length;
        for(int i = 0; i < size; i++) {
            if( i %  2 != 0) {
                System.out.println("The positon is >> " + i + " and the element is >>  " + array[i] );
            }
        }
    }
}
