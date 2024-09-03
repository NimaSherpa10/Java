public class swapThreeNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int temp;
        System.out.println("before swapping >>" + a + " " + b + " " + c  );

        temp = a;
        a = b;
        b = c;
        c = temp;
        System.out.println("After swapping >>" + a + " " + b + " " + c  );
        
    }
}
