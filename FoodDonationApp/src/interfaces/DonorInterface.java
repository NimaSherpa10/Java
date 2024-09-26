package FoodDonationApp.src.interfaces;

public interface DonorInterface {
    
    // Register a Donor
    void registerDonor(String email, String password, String firstName, String lastName, String phoneNumber, String location, String companyName);
    void registerDonation(String donorEmail, String itemName, int quantity, String unit, String expirationDate);
    void displayDonations();
}
