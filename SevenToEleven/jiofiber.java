import static utils.Uilities.*;

public class jiofiber {
    public static void main (String[] args) {
            double price = 699d;
            double percent = 18d;
            String bill = "*" .repeat(50);
            double gstAmount = percentToAmount(price, percent);
            double finalAmount =  price + gstAmount;
            bill += "\n";
            bill += "\t JIO fiber Cost Calculator \t\t\n";
            bill += "\n";
            bill += "\t Price Amount : \t " + price +  "\n";
            bill += "\t Percentage : \t\t " + percent + "% \n";
            bill +="\t Total GST Amount :  " + stripDecimalPoints(gstAmount) +  "\t\n";
            bill += "-".repeat(50);
            bill += "\n";
            bill += "\t Final Amount : \t" + " " + stripDecimalPoints(finalAmount) + "\t\n";

            System.out.println(bill);

            
    }
}
