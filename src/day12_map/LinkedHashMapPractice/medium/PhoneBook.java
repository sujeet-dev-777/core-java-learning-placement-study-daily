package day12_map.LinkedHashMapPractice.medium;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

    public static void main(String[] args) {

        Map<String, String> phoneBook = new LinkedHashMap<>();

        phoneBook.put("Amit", "9876543210");
        phoneBook.put("Rahul", "9876543211");
        phoneBook.put("Neha", "9876543212");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter contact name: ");
        String name = sc.nextLine();

        if (phoneBook.containsKey(name)) {
            System.out.println("Phone Number : " + phoneBook.get(name));
        }
        else {
            System.out.println("Contact not found");
        }

        System.out.println("Phone Book Records");

        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        sc.close();
    }
}