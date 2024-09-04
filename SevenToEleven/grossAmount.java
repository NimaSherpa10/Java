
import static utils.Uilities.*;
public class grossAmount {
    public static void main(String[] args) {
        double salary = 85000d;
        double ta = 15;
        double da = 20;
        double hra = 18;
        double pf = 20;
            double tax = 25d;
            String bill = "*" .repeat(50);
            double taxAmount = percentToAmount(salary, tax);
            double taAmount = percentToAmount(salary, ta);
            double daAmount = percentToAmount(salary, da);
            double hraAmount = percentToAmount(salary, hra);
            double pfAmount = percentToAmount(salary, pf);
            double grossAmount =  (salary + taAmount + daAmount + hraAmount);
            double finalAmount =  (grossAmount -(pfAmount + taxAmount));
            bill += "\n";
            bill += "\t Salary Calculator \t\t\n";
            bill += "\n";
            bill += "\t Salary Amount : \t " + salary +  "\n";
            bill += "\t tax Percentage : \t " + tax + "% \n";
            bill += "\t ta Percentage : \t " + tax + "% \n";
            bill += "\t da Percentage : \t " + tax + "% \n";
            bill += "\t hra Percentage : \t " + tax + "% \n";
            bill += "\t pf Percentage : \t " + tax + "% \n";
            bill +="\t Total Tax Amount :  " + stripDecimalPoints(taxAmount) +  "\t\n";
            bill +="\t Total ta Amount :  " + stripDecimalPoints(taAmount) +  "\t\n";
            bill +="\t Total da Amount :  " + stripDecimalPoints(daAmount) +  "\t\n";
            bill +="\t Total hra Amount :  " + stripDecimalPoints(hraAmount) +  "\t\n";
            bill +="\t Total pf Amount :  " + stripDecimalPoints(pfAmount) +  "\t\n";
            bill += "-".repeat(50);
            bill += "\n";
            bill += "\t Gross Amount : \t" + " " + stripDecimalPoints(grossAmount) + "\t\n";
            bill += "\t Final Salary  : \t" + " " + stripDecimalPoints(finalAmount) + "\t\n";

            System.out.println(bill);
    }
}
