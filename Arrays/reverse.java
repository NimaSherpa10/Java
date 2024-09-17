package Arrays;
import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int [] array = new int [] {1,2,3,4,5};
        int size = array.length;
        int [] newArray = new int [size];

        for(int i = 0; i < array.length; i++) {
            newArray[i] = array[size - 1 - i];
        }
        System.out.println("Orignal array: " + Arrays.toString(array));
        System.out.println("Reversed array: " + Arrays.toString(newArray));
    }
}
