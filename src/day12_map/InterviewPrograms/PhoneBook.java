package day12_map.InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    public static void main(String[] args) {

        Map<String, String> phoneBook = new HashMap<>();

        // Add contacts
        phoneBook.put("Rahul", "9876543210");
        phoneBook.put("Priya", "9876501234");
        phoneBook.put("Aman", "9123456780");

        System.out.println("Initial Phone Book:");
        displayContacts(phoneBook);

        // Search
        String searchName = "Priya";

        System.out.println("Searching for: " + searchName);

        if (phoneBook.containsKey(searchName)) {

            System.out.println("Phone Number: " + phoneBook.get(searchName));

        } else {

            System.out.println("Contact Not Found");
        }

        // Update
        phoneBook.put("Priya", "9999999999");

        System.out.println("After Updating Priya:");
        displayContacts(phoneBook);

        // Delete
        phoneBook.remove("Aman");

        System.out.println("After Removing Aman:");
        displayContacts(phoneBook);
    }

    public static void displayContacts(
            Map<String, String> phoneBook) {

        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {

            System.out.println(entry.getKey() + " -> "  + entry.getValue());
        }
    }
}