public class swapThreeNumbersWithoutTemp {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        System.out.println(swap(a, b, c));
    }

    public static String swap(int a, int b, int c) {
        System.out.println("Before Swapping: " + a + ", " + b + ", " + c);
        a = a + b + c; // 1 + 2 + 3 = 6
        b = a - (b + c); // 6 - (2 + 3) = 1
        c = a - (b + c); // 6 - ( 1 + 3) = 2
        a = a - (b + c); // 6 - (1 + 2) = 3
        return ("After Swapping " + a  + ", " + b + ", " + c);
    }
}
