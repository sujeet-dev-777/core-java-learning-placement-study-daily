package day12_map.Challenge;

import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {

    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();

        // Add products
        inventory.put("Laptop", 10);
        inventory.put("Mouse", 50);
        inventory.put("Keyboard", 30);

        System.out.println("=== Initial Inventory ===");

        displayInventory(inventory);

        // Add stock
        inventory.merge("Laptop", 5, Integer::sum);

        // Add new product using merge
        inventory.merge("Headphones", 20, Integer::sum);

        System.out.println("=== After Adding Stock ===");

        displayInventory(inventory);

        // Sell product
        String productName = "Mouse";
        int quantitySold = 10;

        if (inventory.containsKey(productName)) {

            int currentStock = inventory.get(productName);

            if (currentStock >= quantitySold) {

                inventory.put(productName, currentStock - quantitySold);

                System.out.println("Sold " + quantitySold + " " + productName);

            } else {

                System.out.println("Insufficient stock for " + productName);
            }
        }

        System.out.println("=== Final Inventory ===");

        displayInventory(inventory);
    }

    public static void displayInventory(Map<String, Integer> inventory) {

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {

            System.out.println(entry.getKey() + " -> " + entry.getValue() + " units");
        }
    }
}