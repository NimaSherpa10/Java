package Arrays;
/**
 * 21) Program to print the elements of an array present on even position
 */
import java.util.Arrays;
public class EvenPosition {
    public static void main(String[] args) {
        int [] array = {2,3,4,5,6,7,8,9,10};
        System.out.println("Orignal Array >>> " + Arrays.toString(array));
        PrintEvenPosition(array);
    }

    public static void PrintEvenPosition(int[] array) {
        int size = array.length;
        for(int i = 0; i < size; i++) {
            if( i %  2 == 0) {
                System.out.println("The positon is >> " + i + " and the element is >>  " + array[i] );
            }
        }
    }
}
