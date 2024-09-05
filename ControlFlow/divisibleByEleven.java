

public class divisibleByEleven {
    public static void main(String[] args) {
        int num = 22;
        System.out.println(divisible(num));
    }
    public static String divisible(int num) {
        if(num % 11 == 0) {
            return(num + " is divisble by 11");
        }
        return( num + " is not divisble by 11");
    }
}
