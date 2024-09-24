package Object.QuesitonSeven;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Creating a financial petition
        System.out.println("----------------------------------------------------------------");
        FinancialPetition financialPetition = new FinancialPetition(1, "John Doe", new Date(), 
            "123 Main St", "Anytown", "Road construction delay", "Pending", 50000.0);


        // Creating a non-financial petition
        NonFinancialPetition nonFinancialPetition = new NonFinancialPetition(2, "Jane Doe", new Date(), 
            "456 Maple St", "Othertown", "Need for a new public park", "Approved", 
            "James Smith", new Date());

        // Displaying petition details
        financialPetition.displayPetitionDetails();
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        nonFinancialPetition.displayPetitionDetails();
    }
}
