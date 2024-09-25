package FoodDonationApp;

import java.util.Scanner;

import FoodDonationApp.src.models.Donor;
import FoodDonationApp.src.models.Recipient;
import FoodDonationApp.src.models.User;
import FoodDonationApp.src.services.UserManager;
import FoodDonationApp.src.menus.DonorMenu;
import FoodDonationApp.src.menus.RecipientMenu;
import FoodDonationApp.src.menus.LoginHandler;
import FoodDonationApp.src.menus.RegisterHandler;

public class Main {
    private static UserManager userManager = new UserManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to the Food Donation App!");
            System.out.println("1. Login");
            System.out.println("2. Signup");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    signup();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void login() {
        LoginHandler loginHandler = new LoginHandler(userManager);
        User user = loginHandler.login();
        if (user instanceof Donor) {
            DonorMenu donorMenu = new DonorMenu(userManager);
            donorMenu.displayDonorMenu((Donor) user);
        } else if (user instanceof Recipient) {
            RecipientMenu recipientMenu = new RecipientMenu(userManager);
            recipientMenu.displayRecipientMenu((Recipient) user);
        }
    }

    private static void signup() {
        RegisterHandler registerHandler = new RegisterHandler(userManager);
        registerHandler.register();
    }
}
