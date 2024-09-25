package FoodDonationApp.src.models;

public class Recipient extends User {
    public Recipient(String email, String password, String firstName, String lastName, String phoneNumber, String location) {
        super(email, password, firstName, lastName, phoneNumber, location);
    }
    public String toString() {
        return "Recipient{" + super.toString() + "}";
    }
}
