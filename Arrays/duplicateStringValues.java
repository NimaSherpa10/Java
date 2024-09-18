package Arrays;

public class duplicateStringValues {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange", "apple", "kiwi", "banana", "grape"};

        System.out.println("Duplicate values in the array:");
        
        // Outer loop to pick elements one by one
        for (int i = 0; i < array.length - 1; i++) {
            // Inner loop to compare the picked element with the rest of the elements
            for (int j = i + 1; j < array.length; j++) {
                // If a duplicate is found, print it
                if (array[i].equals(array[j])) {
                    System.out.println(array[i]);
                    // Break to avoid printing the same duplicate more than once
                    break;
                }
            }
        }
    }
}
