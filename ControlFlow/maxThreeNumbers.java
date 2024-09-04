

public class maxThreeNumbers {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 9;
        System.out.println(max(a,b,c));
    }
    public static int max(int a , int b ,int c) {
        if(a > b && a > c) {
            return a;
        }
        else if(b > a && b > c) {
            return b;
        }
        else{
            return c;
        }
    }
}
