package FoodDonationApp.src.interfaces;

import FoodDonationApp.src.models.User;

public interface UserInterface {


 

    // Login function
    User login(String email, String password);

    // Display all registered users
    void displayUsers();


    
   

 
}
