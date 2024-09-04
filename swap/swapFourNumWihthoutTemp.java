public class swapFourNumWihthoutTemp {
    //swap without temp
    public static String swapWithoutTemp(int a, int b, int c, int d) {
        a = a + b + c + d; // a now holds the sum of a, b, c, and d
    
        d = a - (b + c + d); // d now holds the original value of a
        c = a - (b + c + d); // c now holds the original value of d (before d was updated)
        b = a - (b + c + d); // b now holds the original value of c (before c was updated)
        a = a - (b + c + d); // a now holds the original value of b (before b was updated)
    
        return "After Swapping without Temp: " + a + ", " + b + ", " + c + ", " + d;
    }

    //swap with temp
    public static String swapWithTemp(int a, int b, int c, int d) {
        int temp = a;
        a = d;
        d = c;
        c = b;
        b = temp;
    
        return "After Swapping with Temp: " + a + ", " + b + ", " + c + ", " + d;
    }
    
    //main method
    public static void main(String[] args) {
            int a = 1, b = 2, c =3,  d= 4;     
            System.out.println("Before swapping >> " + a + ", " + b + ", " + c + ", "+ d);   
            System.out.println(swapWithTemp(a, b, c, d));
            System.out.println(swapWithoutTemp(a, b, c, d));
    }

}
