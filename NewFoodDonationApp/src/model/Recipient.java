package NewFoodDonationApp.src.model;

public class Recipient extends User {
    public Recipient(String name, String password, String email, String phoneNumber) {
        super(name, password, email, phoneNumber, "recipient");
   }
}
