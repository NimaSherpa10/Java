package FoodDonationApp.src.test;

import FoodDonationApp.src.models.*;
import FoodDonationApp.src.services.UserManager;

public class Test {
    public static void main(String[] args) {
        // Create UserManager instance
        UserManager userManager = new UserManager();

        // Test Donor Registration
        System.out.println("Testing Donor Registration:");
        userManager.registerDonor(
                "donor@example.com",
                "password123",
                "John",
                "Doe",
                "123-456-7890",
                "123 Donation St",
                "HelpingHands Inc."
        );

        // Test Recipient Registration
        System.out.println("\nTesting Recipient Registration:");
        userManager.registerRecipient(
                "recipient@example.com",
                "recipientPass",
                "Jane",
                "Smith",
                "987-654-3210",
                "456 Charity Ave"
        );

        // Test Login
        User loggedInUser = userManager.login("donor@example.com", "password123");
        assert loggedInUser != null : "Login failed for donor!";
        System.out.println("Logged in as: " + loggedInUser);

        User invalidUser = userManager.login("recipient@example.com", "wrongPassword");
        assert invalidUser == null : "Login should have failed for invalid password!";
        System.out.println("Login failed for invalid credentials as expected.");

        // Display all registered users
        System.out.println("\nDisplaying all registered users:");
        userManager.displayUsers();

        
    }
}
