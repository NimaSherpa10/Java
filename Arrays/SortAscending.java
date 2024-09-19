package Arrays;
import java.util.Arrays;
public class SortAscending {
    public static void main(String[] args) {
        int[] array = {6,5,4,3,2,1};
        System.out.println("Orignal array >>> " + Arrays.toString(array));
        sortArray(array);
    }

    public static void sortArray(int[]array) {
        int size = array.length;
        for(int i = 0; i < size - 1; i++) {
            for(int j = 0; j < size - 1 - i; j++) {
                if(array[j] > array[j+ 1]) {
                    int temp = array[j];
                    array[j] = array[j+ 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("sorted array >>> " + Arrays.toString(array));
    }
}
