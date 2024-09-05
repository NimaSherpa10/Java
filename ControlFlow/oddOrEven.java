public class oddOrEven {
    public static void main(String[] args) {
            int num1 = 2;
            int num2 = 3;
            System.out.println(oddOrEvenCheck(num1));
            System.out.println(oddOrEvenCheck(num2));
    }

    public static String oddOrEvenCheck(int num) {
            if(num % 2 == 0) {
                return ("The given number is Even");
            }
            return ("The number is odd");
    }
}