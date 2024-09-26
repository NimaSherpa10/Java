package NewFoodDonationApp.src.Implementation;

import FoodDonationApp.src.interfaces.DonorInterface;
import FoodDonationApp.src.interfaces.UserInterface;
import NewFoodDonationApp.src.interfaces.ConsumerInterface;
import NewFoodDonationApp.src.model.*;
import java.util.*;

public class authImplementation implements UserInterface {
        private HashMap<Integer, User> userMap; 
        Scanner in = new Scanner(System.in);
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


        public class authImplementation implements UserInterface {
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
            public User login(String email, String password) {
                for (User user : userMap.values()) {
                    if (user.getEmail().equalsIgnoreCase(email)) { 
                        if (user.getPassword().equals(password)) {  
                            System.out.println("Login successful!");
                            return user;
                        } else {
                            System.out.println("Invalid password.");
                            return null;  
                        }
                    }
                }
                System.out.println("No user found with the provided email.");
                return null; 
            }
        }
        


        

}
