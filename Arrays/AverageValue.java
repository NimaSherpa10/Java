package Arrays;
import java.util.Arrays;

public class AverageValue {
    public static void main(String[] args) {
        int [] array = new int[] {1,2,3,4,5};
        int sum = 0;
        int average = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;

        System.out.println("Given Array is >> " + Arrays.toString(array) );
        System.err.println("The Average is >>> " + average);
    }
}
