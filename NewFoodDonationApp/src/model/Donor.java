package NewFoodDonationApp.src.model;

public class Donor extends User {
   public Donor(String name, String password, String email, int id,  String phoneNumber) {
        super(name, password, email, phoneNumber, id, "donor");
   }
}
