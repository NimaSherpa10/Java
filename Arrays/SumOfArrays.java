package Arrays;

import java.util.Arrays;

public class SumOfArrays {
    public static void main(String[] args) {
         int [] array = {2,3,4,5,6,7,8,9,10};
            System.out.println("Orignal Array >>> " + Arrays.toString(array));
            double SumOfArrays = Sum(array);
            System.out.println("The sum of the elements of the array is >>> " + SumOfArrays);
    }

    public static double Sum(int[]array) {
        int size = array.length;
        double sum = 0;
        for(int i = 0; i < size; i++) {
            sum += array[i];
        }
        return sum;
    }
}
