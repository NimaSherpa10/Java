
import static utils.Uilities.*;
public class salary {
    public static void main(String[] args) {
            double salary = 85000d;
            double tax = 20d;
            String bill = "*" .repeat(50);
            double taxAmount = percentToAmount(salary, tax);
            double finalAmount =  (salary + taxAmount);
            bill += "\n";
            bill += "\t Salary Calculator \t\t\n";
            bill += "\n";
            bill += "\t Salary Amount : \t " + salary +  "\n";
            bill += "\t tax Percentage : \t " + tax + "% \n";
            bill +="\t Total Tax Amount :  " + stripDecimalPoints(taxAmount) +  "\t\n";
            bill += "-".repeat(50);
            bill += "\n";
            bill += "\t Final Salary  : \t" + " " + stripDecimalPoints(finalAmount) + "\t\n";

            System.out.println(bill);
    }
}
