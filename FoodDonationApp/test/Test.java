package FoodDonationApp.test;

import FoodDonationApp.src.models.Donor;
import FoodDonationApp.src.models.Recipient;
import FoodDonationApp.src.models.User;

public class Test {
   public static void main(String[] args) {
     Donor donor = new Donor(
            "donor@example.com", 
            "password123", 
            "John", 
            "Doe", 
            "123-456-7890", 
            "123 Donation St", 
            "HelpingHands Inc."
        );

        // Create a Recipient object
        Recipient recipient = new Recipient(
            "recipient@example.com", 
            "recipientPass", 
            "Jane", 
            "Smith", 
            "987-654-3210", 
            "456 Charity Ave"
        );

        System.out.println(donor);

        System.out.println();

        System.out.println(recipient);
   }
}
