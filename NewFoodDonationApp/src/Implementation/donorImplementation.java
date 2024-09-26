package NewFoodDonationApp.src.Implementation;

import NewFoodDonationApp.src.interfaces.DonorInterface;
import NewFoodDonationApp.src.model.Donor;
import NewFoodDonationApp.src.model.Item;
import java.util.HashMap;

public class donorImplementation implements DonorInterface {
    private HashMap<Integer, Item> items; // Use the global item map passed from Main
    private Donor loggedInDonor;

    public donorImplementation(HashMap<Integer, Item> items, Donor loggedInDonor) {
        this.items = items; // Use global items map
        this.loggedInDonor = loggedInDonor; // Store the logged-in donor
    }

    @Override
    public void donateItem(String name, double quantity, String unit, String expirationDate) {
        if (loggedInDonor != null) {
            Item newItem = new Item(name, quantity, unit, expirationDate, false, loggedInDonor.getUserID());
            items.put(newItem.getItemId(), newItem); // Add to global items map
            System.out.println("Item donated successfully by " + loggedInDonor.getName());
        } else {
            System.out.println("No donor is logged in.");
        }
    }

    @Override
    public void viewDonatedItem() {
        if (loggedInDonor != null) {
            boolean found = false;
            System.out.println("Items donated by donor ID: " + loggedInDonor.getUserID());
            for (Item item : items.values()) {
                if (item.getDonorId() == loggedInDonor.getUserID()) {
                    System.out.println(item.toString()); // Display the donated item
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No items found for this donor.");
            }
        } else {
            System.out.println("No donor is logged in.");
        }
    }
}
