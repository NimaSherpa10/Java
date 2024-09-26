package FoodDonationApp.src.interfaces;

import FoodDonationApp.src.models.User;

public interface UserInterface {

    // Register a Donor
    void registerDonor(String email, String password, String firstName, String lastName, String phoneNumber, String location, String companyName);

    // Register a Recipient
    void registerRecipient(String email, String password, String firstName, String lastName, String phoneNumber, String location);

    // Login function
    User login(String email, String password);

    // Display all registered users
    void displayUsers();

    // Register a Donation
    void registerDonation(String donorEmail, String itemName, int quantity, String unit, String expirationDate);

    // Display all donations
    void displayDonations();

    // Claim a donation item
    void claimDonationItem(String donorEmail, String itemName, String recipientEmail);

    // Get all donations by a particular donor
    void getDonationsByDonor(String donorEmail);
}
