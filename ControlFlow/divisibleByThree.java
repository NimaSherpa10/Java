
public class divisibleByThree {
    public static void main(String[] args) {
        int num = 30;
        System.out.println(divisible(num));
    }
    public static String divisible(int num) {
        if(num % 3 == 0) {
            return(num + " is divisble by 3");
        }
        return("The" + num + " is not divisble by 3");
    }
}
