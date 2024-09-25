package FoodDonationApp.src.menus;

import FoodDonationApp.src.models.User;
import FoodDonationApp.src.services.UserManager;

import java.util.Scanner;

public class LoginHandler {
    private UserManager userManager;
    private Scanner scanner;

    public LoginHandler(UserManager userManager) {
        this.userManager = userManager;
        this.scanner = new Scanner(System.in);
    }

    public User login() {
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        User user = userManager.login(email, password);
        if (user != null) {
            return user;
        } else {
            System.out.println("Invalid login.");
            return null;
        }
    }
}
