package NewFoodDonationApp.src.model;

public class Item {
    private String name;
    private double quantity;
    private String unit; 
    private String expirationDate;
    private boolean claimed;
    private int itemId;

    public Item(String name, double quantity, String unit, String expirationDate, boolean claimed) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.expirationDate = expirationDate;
        this.claimed = claimed;
        this.itemId = itemId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {  
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String date) {
        this.expirationDate = date;
    }

    public boolean isClaimed() {
        return claimed;
    }

    public void setClaimed(boolean claim) {
        this.claimed = claim;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Item{");
        sb.append("name='").append(name).append('\'');
        sb.append(", quantity=").append(quantity);
        sb.append(", unit='").append(unit).append('\'');
        sb.append(", expirationDate='").append(expirationDate).append('\'');
        sb.append(", claimed=").append(claimed);
        sb.append(", itemId=").append(itemId);
        sb.append('}');
        return sb.toString();
    }
}
