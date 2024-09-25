package FoodDonationApp.src.models;

import java.util.ArrayList;

public class Donation {
    private String donorEmail;
    private ArrayList<DonationItem> donationItems; // List to track all items in the donation

    public Donation(String donorEmail) {
        this.donorEmail = donorEmail;
        this.donationItems = new ArrayList<>();
    }

    // Add a DonationItem to the list
    public void addItem(DonationItem item) {
        this.donationItems.add(item);
    }

    public String getDonorEmail() {
        return donorEmail;
    }

    public ArrayList<DonationItem> getDonationItems() {
        return donationItems;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Donor Email: ").append(donorEmail).append("\nDonation Items:\n");
        for (DonationItem item : donationItems) {
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }
}
