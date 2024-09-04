

public class maxNumber {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        System.out.println(max(a,b));
    }
    public static int max(int a, int b) {
            if(a > b) {
                return a;
            }
            return b;
    }
}
