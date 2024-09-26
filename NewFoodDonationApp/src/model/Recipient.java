package NewFoodDonationApp.src.model;

public class Recipient extends User {
    public Recipient(String name, String password, String email,int id, String phoneNumber) {
        super(name, password, email, phoneNumber, id,  "recipient");
   }
}
