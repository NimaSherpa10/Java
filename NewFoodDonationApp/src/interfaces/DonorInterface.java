package NewFoodDonationApp.src.interfaces;

public interface DonorInterface {
    void donateItem(String name, double quantity, String unit, String expirationDate);
    void viewDonatedItem();
}
