package NewFoodDonationApp.src.interfaces;
import NewFoodDonationApp.src.model.User;

public interface userInterface {
    void registerUser(String name, String password, String email, String phoneNumber,int id, String role);
    User Login(String username, String password);

}
