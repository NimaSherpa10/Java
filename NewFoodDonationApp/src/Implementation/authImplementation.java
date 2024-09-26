package NewFoodDonationApp.src.Implementation;

import NewFoodDonationApp.src.interfaces.userInterface;
import NewFoodDonationApp.src.model.*;
import NewFoodDonationApp.src.model.User;
import java.util.*;

public class authImplementation implements userInterface {
    private HashMap<Integer, User> userMap; // userMap using ID as key
    Scanner in = new Scanner(System.in);

    public authImplementation() {
        this.userMap = new HashMap<>();
    }

    // Register User (as you've already implemented)
    public void registerUser(String name, String password, String email, String phoneNumber, int id, String role) {
        if (userMap.containsKey(id)) {  
            System.out.println("User with this ID already registered!");
            return;
        }

        if (role.equalsIgnoreCase("donor")) {  
            Donor donor = new Donor(name, password, email, id, phoneNumber);
            userMap.put(id, donor);
            System.out.println("New donor added successfully");
        } 
        else if (role.equalsIgnoreCase("recipient")) {  
            Recipient recipient = new Recipient(name, password, email, id, phoneNumber);
            userMap.put(id, recipient);
            System.out.println("New recipient added successfully");
        } 
        else {
            System.out.println("Invalid role. Please specify either 'donor' or 'recipient'.");
        }
    }

    // Login Method
    public User Login(String email, String password) {
        // Loop through userMap to find user by email
        for (User user : userMap.values()) {
            if (user.getEmail().equalsIgnoreCase(email)) { // Use getEmail() to check the email
                if (user.getPassword().equals(password)) {  // Check password match
                    System.out.println("Login successful!");
                    return user; // Return the logged-in user
                } else {
                    System.out.println("Invalid password.");
                    return null;  // Incorrect password
                }
            }
        }
        System.out.println("No user found with the provided email.");
        return null; // No user found
    }

}

