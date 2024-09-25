package FoodDonationApp.src.services;

import java.util.ArrayList;
import java.util.HashMap;

import FoodDonationApp.src.models.*;

public class UserManager {
    private HashMap<String, User> userMap; 
    private ArrayList<Donor> donors;
    private ArrayList<Recipient> recipients;

    public UserManager() {
        this.donors = new ArrayList<>();
        this.recipients = new ArrayList<>();
        this.userMap = new HashMap<>();
    }

    // Register a Donor
    public void registerDonor(String email, String password, String firstName, String lastName, String phoneNumber, String location, String companyName) {
        if (userMap.containsKey(email)) {
            System.out.println("Email already registered!");
            return;
        }
        Donor donor = new Donor(email, password, firstName, lastName, phoneNumber, location, companyName);
        donors.add(donor);
        userMap.put(email, donor);
        System.out.println("Donor registered successfully!");
    }

    // Register a Recipient
    public void registerRecipient(String email, String password, String firstName, String lastName, String phoneNumber, String location) {
        if (userMap.containsKey(email)) {
            System.out.println("Email already registered!");
            return;
        }
        Recipient recipient = new Recipient(email, password, firstName, lastName, phoneNumber, location);
        recipients.add(recipient);
        userMap.put(email, recipient);
        System.out.println("Recipient registered successfully!");
    }

    // Login function
    public User login(String email, String password) {
        User user = userMap.get(email);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login successful!");
            return user;
        }
        System.out.println("Login failed. Invalid email or password.");
        return null;
    }

    // Display all registered users (for testing purposes)
    public void displayUsers() {
        for (User user : userMap.values()) {
            System.out.println(user);
        }
    }
}
