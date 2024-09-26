package FoodDonationApp.src.models;

public class DonationItem {
    private String itemName;
    private int quantity;
    private String unit; 
    private String expirationDate;
    private boolean claimed; 

    public DonationItem(String itemName, int quantity, String unit, String expirationDate) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.unit = unit;
        this.expirationDate = expirationDate;
        this.claimed = false; 
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

    public boolean isClaimed() {
        return claimed; 
    }

    public void claim() {
        if (!claimed) {
            claimed = true; // Mark the item as claimed
            System.out.println(itemName + " claimed successfully!");
        } else {
            System.out.println("Claim failed: Item already claimed.");
        }
    }

    @Override
    public String toString() {
        return "Item: " + itemName + ", Quantity: " + quantity + " " + unit + ", Expiration Date: " + expirationDate + ", Claimed: " + (claimed ? "Yes" : "No");
    }
}
