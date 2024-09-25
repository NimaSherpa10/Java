package FoodDonationApp.src.models;

public class DonationItem {
    private String itemName;
    private int quantity;
    private String unit; 
    private String expirationDate;

    public DonationItem(String itemName, int quantity, String unit, String expirationDate) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.unit = unit;
        this.expirationDate = expirationDate;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "Item: " + itemName + ", Quantity: " + quantity + " " + unit + ", Expiration Date: " + expirationDate;
    }
}
