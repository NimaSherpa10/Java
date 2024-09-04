import static utils.Uilities.*;

public class pizza {
    public static void main(String[] args) {
        double price = 399.0d;
            double discount = 20d;
            String bill = "*" .repeat(50);
            double discountAmount = percentToAmount(price, discount);
            double noOfPizza = 2;
            double finalAmount = noOfPizza * (price + discountAmount);
            bill += "\n";
            bill += "\t Pizza Cost Calculator \t\t\n";
            bill += "\n";
            bill += "\t Price Amount : \t " + price +  "\n";
            bill += "\t Discount Percentage : \t " + discount + "% \n";
            bill +="\t Total Discount Amount :  " + stripDecimalPoints(discountAmount) +  "\t\n";
            bill += "-".repeat(50);
            bill += "\n";
            bill += "\t Final Amount : \t" + " " + stripDecimalPoints(finalAmount) + "\t\n";

            System.out.println(bill);
    }
}
