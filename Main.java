public class Main {
public static void main(String[] args) {
     int a = 20;
     int b = 30;
     System.out.println(a + "\t" + b);
     int x = b;
      b = a;
      a = x;
      System.out.println(a + "\t" + b);
    }
}