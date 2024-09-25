package FoodDonationApp.src.models;

import java.util.ArrayList;

public class Donation {
    private String donorEmail;
    private boolean claimed; // New field to track claimed status
    private ArrayList<DonationItem> items;

    public Donation(String donorEmail) {
        this.donorEmail = donorEmail;
        this.claimed = false; // Initially, donations are not claimed
        this.items = new ArrayList<>();
    }

    public String getDonorEmail() {
        return donorEmail;
    }

    public boolean isClaimed() {
        return claimed;
    }

    public void claim() {
        this.claimed = true; // Method to mark donation as claimed
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
          .append("\nClaimed: ").append(claimed ? "Yes" : "No")
          .append("\nDonation Items:\n");
        for (DonationItem item : items) {
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }
}
