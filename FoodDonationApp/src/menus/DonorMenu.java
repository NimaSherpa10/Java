package FoodDonationApp.src.menus;

import FoodDonationApp.src.models.Donor;
import FoodDonationApp.src.services.UserManager;

import java.util.Scanner;

public class DonorMenu {
    private UserManager userManager;
    private Scanner scanner;

    public DonorMenu(UserManager userManager) {
        this.userManager = userManager;
        this.scanner = new Scanner(System.in);
    }

    public void displayDonorMenu(Donor donor) {
        while (true) {
            System.out.println("Donor Menu:");
            System.out.println("1. Add Donation");
            System.out.println("2. View All Donations");
            System.out.println("3. Logout");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addDonation(donor);
                    break;
                case 2:
                    userManager.displayDonations();
                    break;
                case 3:
                    return; // Logout
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void addDonation(Donor donor) {
        System.out.print("Item Name: ");
        String itemName = scanner.nextLine();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Unit (KG, grams, liters): ");
        String unit = scanner.nextLine();
        System.out.print("Expiration Date (YYYY-MM-DD): ");
        String expirationDate = scanner.nextLine();

        userManager.registerDonation(donor.getEmail(), itemName, quantity, unit, expirationDate);
    }
}
