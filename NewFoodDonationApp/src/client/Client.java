package NewFoodDonationApp.src.client;

import NewFoodDonationApp.src.Implementation.authImplementation;
import NewFoodDonationApp.src.Implementation.donorImplementation;
import NewFoodDonationApp.src.Implementation.recipientImplementation;
import NewFoodDonationApp.src.interfaces.DonorInterface;
import NewFoodDonationApp.src.interfaces.recipientInterface;
import NewFoodDonationApp.src.interfaces.userInterface;
import NewFoodDonationApp.src.model.Donor;
import NewFoodDonationApp.src.model.Item;
import NewFoodDonationApp.src.model.Recipient;
import NewFoodDonationApp.src.model.User;

import java.util.HashMap;
import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    private static userInterface auth = new authImplementation();  // Interact with userInterface for authentication
    private static HashMap<Integer, Item> items = new HashMap<>();  // Store all donation items

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
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Attempt to login via authImplementation through the userInterface
        User user = auth.Login(email, password);

        if (user != null) {
            if (user instanceof Donor) {
                System.out.println("Logged in as Donor.");
                DonorInterface donorImp = new donorImplementation(items, (Donor) user);  // Pass global items map
                donorMenu((Donor) user, donorImp);  // Handle donor-specific actions
            } else if (user instanceof Recipient) {
                System.out.println("Logged in as Recipient.");
                recipientInterface recipientImp = new recipientImplementation(items);  // Use recipientInterface
                recipientMenu((Recipient) user, recipientImp);  // Handle recipient-specific actions
            }
        } else {
            System.out.println("Invalid login credentials. Please try again.");
        }
    }

    private static void signup() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter role (donor/recipient): ");
        String role = scanner.nextLine();
        int id = (int) (Math.random() * 1000); // Generate a random ID for simplicity

        auth.registerUser(name, password, email, phoneNumber, id, role);  // Interact with userInterface for registration
    }

    private static void donorMenu(Donor donor, DonorInterface donorImp) {
        while (true) {
            System.out.println("Donor Menu:");
            System.out.println("1. Donate Item");
            System.out.println("2. View My Donations");
            System.out.println("3. Logout");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Logic to donate item
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    double quantity = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter unit (e.g., kg, pieces): ");
                    String unit = scanner.nextLine();
                    System.out.print("Enter expiration date (dd/MM/yyyy): ");
                    String expDate = scanner.nextLine();

                    donorImp.donateItem(itemName, quantity, unit, expDate);
                    break;
                case 2:
                    // View donated items
                    donorImp.viewDonatedItem();
                    break;
                case 3:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private static void recipientMenu(Recipient recipient, recipientInterface recipientImp) {
        while (true) {
            System.out.println("Recipient Menu:");
            System.out.println("1. View Available Items");
            System.out.println("2. Claim Item");
            System.out.println("3. Logout");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // View all available items
                    recipientImp.viewAllItems();
                    break;
                case 2:
                    // Claim an item by ID
                    System.out.print("Enter item ID to claim: ");
                    int itemId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    recipientImp.claimItem(itemId);
                    break;
                case 3:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
