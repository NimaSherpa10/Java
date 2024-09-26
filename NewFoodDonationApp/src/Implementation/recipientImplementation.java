package NewFoodDonationApp.src.Implementation;

import NewFoodDonationApp.src.interfaces.recipientInterface;
import NewFoodDonationApp.src.model.Item;
import java.util.*;

public class recipientImplementation implements recipientInterface {
    // void viewAllItems();
    // void claimItem(int itemId);
    HashMap<Integer, Item> items;

    public recipientImplementation(HashMap<Integer, Item> items) {
        this.items = items;
    }

    public void viewAllItems() {
        System.out.println("Available items for donation:");
        boolean found = false;

        // Loop through the items and display only those that are not yet claimed
        for (Item item : items.values()) {
                System.out.println(item.toString()); 
                found = true;
            
        }

        if (!found) {
            System.out.println("No available items for donation.");
        }
    }

    public void claimItem(int itemId) {
        // Find the item by itemId
        Item item = items.get(itemId);

        // Check if the item exists and is not already claimed
        if (item != null && !item.isClaimed()) {
            item.setClaimed(true);  // Mark the item as claimed
            System.out.println("Item with ID " + itemId + " has been claimed successfully.");
        } else if (item != null && item.isClaimed()) {
            System.out.println("Item with ID " + itemId + " has already been claimed.");
        } else {
            System.out.println("Item with ID " + itemId + " does not exist.");
        }
    }
    
}
