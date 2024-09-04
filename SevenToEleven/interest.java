import static utils.Uilities.*;

public class interest {
    public static void main(String[] args) {
            double deposit = 500000d;
            double year = 5;
            double interestRate = 6.8d;
            String bill = "*" .repeat(50);
            double PTR = deposit * year * interestRate;
            double interestAmount = percentToAmount(PTR, 1);
            double finalAmount =  (deposit + interestAmount);
            bill += "\n";
            bill += "\t Interest Calculator \t\t\n";
            bill += "\n";
            bill += "\t Deposit Amount : \t " + deposit +  "\n";
            bill += "\t Interest Percentage : \t " + interestRate + "% \n";
            bill +="\t Total Interest Amount :  " + stripDecimalPoints(interestAmount) +  "\t\n";
            bill += "-".repeat(50);
            bill += "\n";
            bill += "\t Final Salary  : \t" + " " + stripDecimalPoints(finalAmount) + "\t\n";

            System.out.println(bill);
    }
}
