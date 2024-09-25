package FoodDonationApp.src.menus;

import FoodDonationApp.src.models.Recipient;
import FoodDonationApp.src.services.UserManager;

import java.util.Scanner;

public class RecipientMenu {
    private UserManager userManager;
    private Scanner scanner;

    public RecipientMenu(UserManager userManager) {
        this.userManager = userManager;
        this.scanner = new Scanner(System.in);
    }

    public void displayRecipientMenu(Recipient recipient) {
        while (true) {
            System.out.println("Recipient Menu:");
            System.out.println("1. View All Donations");
            System.out.println("2. Claim Donation");
            System.out.println("3. Logout");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    userManager.displayDonations();
                    break;
                case 2:
                    claimDonation(recipient);
                    break;
                case 3:
                    return; // Logout
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void claimDonation(Recipient recipient) {
        System.out.print("Enter the donor email of the donation you want to claim: ");
        String donorEmail = scanner.nextLine();
        userManager.claimDonation(donorEmail, recipient.getEmail());
    }
}
