package Object.QuesitonSeven;
import java.util.Date;

public class FinancialPetition extends Petition {
    private double amountInvolved;

    // Constructor for FinancialPetition
    public FinancialPetition(int petitionId, String name, Date dateRegistered, String location, 
                             String city, String problemDescription, String status, double amountInvolved) {
        super(petitionId, name, dateRegistered, location, city, problemDescription, status);
        this.amountInvolved = amountInvolved;
    }

    // Getter and Setter for AmountInvolved
    public double getAmountInvolved() {
        return amountInvolved;
    }

    public void setAmountInvolved(double amountInvolved) {
        this.amountInvolved = amountInvolved;
    }

    // Override to include amount involved in details
    @Override
    public void displayPetitionDetails() {
        super.displayPetitionDetails();
        System.out.println("Amount Involved: $" + amountInvolved);
    }
}