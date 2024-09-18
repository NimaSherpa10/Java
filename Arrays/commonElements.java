package Arrays;

public class commonElements {
    public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "orange", "kiwi", "grape"};
        String[] array2 = {"pear", "kiwi", "banana", "mango", "grape"};

        System.out.println("Common elements between the two arrays:");
        
        for (int i = 0; i < array1.length; i++) {
           
            for (int j = 0; j < array2.length; j++) {
                
                if (array1[i].equals(array2[j])) {
                    System.out.println(array1[i]);
                    break; 
                }
            }
        }
    }
}
