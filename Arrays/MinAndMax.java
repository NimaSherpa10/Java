package Arrays;
import java.util.Arrays;


public class MinAndMax {
    public static void main(String[] args) {
        int [] array = new int [] {1, 4, 6, 10 , -1};
        int  min = minimum(array);
        int max = maximum(array);

        System.out.println(Arrays.toString(array));

        System.out.println("The minimum value in the array is " + min);
        System.out.println("The maximum value in the array is " + max);
    }

    public static int minimum(int[] array) {
            int min = array[0];
            for(int i = 0; i < array.length; i++) {
                if(array[i] < min) {
                    min = array[i];
                }
            }
            return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
            for(int i = 0; i < array.length; i++) {
                if(array[i] > max) {
                    max = array[i];
                }
            }
            return max;
    }
}
