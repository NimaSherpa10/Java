

public class divisiblebyFive {
    public static void main(String[] args) {
        int num = 6;
        System.out.println(divisible(num));
    }
    public static String divisible(int num) {
        if(num % 5 == 0) {
            return(num + " is divisble by 5");
        }
        return( num + " is not divisble by 3");
    }
    }

