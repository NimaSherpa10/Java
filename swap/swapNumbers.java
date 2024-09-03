package swap;
public class swapNumbers {
    //swapping without temp variables
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        
        System.out.println("Before swapping");
        System.out.println(a + "\t" + b);

         a = a + b; //20 + 30 : 50
         b = a - b; // 50 - 30 = 20
         a = a - b; 
         System.out.println("After swapping");
         System.out.println(a + "\t" + b);
    }
}
