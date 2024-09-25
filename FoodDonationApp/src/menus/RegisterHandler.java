package FoodDonationApp.src.menus;

import FoodDonationApp.src.services.UserManager;

import java.util.Scanner;


public class RegisterHandler {
    private UserManager userManager;
    private Scanner scanner;

    public RegisterHandler(UserManager userManager) {
        this.userManager = userManager;
        this.scanner = new Scanner(System.in);
    }

    public void register() {
        String role = "";
        boolean validRole = false;

        // Loop until a valid role is entered
        while (!validRole) {
            System.out.print("Enter your role (donor/recipient): ");
            role = scanner.nextLine().toLowerCase();

            if (role.equals("donor") || role.equals("recipient")) {
                validRole = true;
            } else {
                System.out.println("Invalid role. Please enter 'donor' or 'recipient'.");
            }
        }

        
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Location: ");
        String location = scanner.nextLine();

     // Role-specific information
        if (role.equals("donor")) {
            System.out.print("Company Name (optional): ");
            String companyName = scanner.nextLine();
            userManager.registerDonor(email, password, firstName, lastName, phoneNumber, location, companyName);
        } else if (role.equals("recipient")) {
            userManager.registerRecipient(email, password, firstName, lastName, phoneNumber, location);
        }
        
        System.out.println("Registration successful for " + role + "!");
    }
}
