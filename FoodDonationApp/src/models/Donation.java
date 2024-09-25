package FoodDonationApp.src.models;

import java.util.ArrayList;

public class Donation {
    private String donorEmail;
    private ArrayList<DonationItem> items;

    public Donation(String donorEmail) {
        this.donorEmail = donorEmail;
        this.items = new ArrayList<>();
    }

    public String getDonorEmail() {
        return donorEmail;
    }

    public void addItem(DonationItem item) {
        items.add(item);
    }

    public ArrayList<DonationItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Donor Email: ").append(donorEmail)
          .append("\nDonation Items:\n");
        for (DonationItem item : items) {
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }
}
