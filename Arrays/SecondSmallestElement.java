package Arrays;
import java.util.Arrays;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int [] array = new int [] {13,12,3,4,5,6,7,8,9,10};
        int SecondSmallestElement = secondSmallest(array);

        System.out.println("The given array is " + Arrays.toString(array));

        if(SecondSmallestElement != -1) {
            System.out.println("The second minimum element on the array is " + SecondSmallestElement);
        }
        else {
            System.out.println("Error! min element not found");
        }
    }

    public static int secondSmallest(int[] array) {
        int size = array.length;
        int min = array[0];
        int second_min = array[0];

        if(size < 2) {
            return -1;
        }
        
        for(int i = 0; i < size; i++) {
            if(array[i] < min) {
                second_min = min;
                min = array[i];
            }

            else if(array[i] < second_min && array[i] != min) {
                second_min = array[i];
            }
        }
       
        return second_min;
    }
}
