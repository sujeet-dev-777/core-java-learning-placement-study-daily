package day12_map.HashtablePractice;

import java.util.Hashtable;
import java.util.Map;

public class BasicHashtable {

    public static void main(String[] args) {

        Hashtable<Integer, String> employeeMap = new Hashtable<>();

        // Add Elements
        employeeMap.put(101, "Rahul");
        employeeMap.put(102, "Neha");
        employeeMap.put(103, "Aman");
        employeeMap.put(104, "Priya");

        // Display
        System.out.println("Employee Records:");
        System.out.println(employeeMap);

        // Get
        System.out.println("Employee with ID 102 : " + employeeMap.get(102));

        // Update
        employeeMap.put(103, "Karan");

        // Remove
        employeeMap.remove(104);

        System.out.println("After Update and Remove:");

        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {

            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }

        // containsKey
        System.out.println("Contains ID 101 : " + employeeMap.containsKey(101));

        // containsValue
        System.out.println("Contains Rahul : " + employeeMap.containsValue("Rahul"));

        // Size
        System.out.println("Total Employees : " + employeeMap.size());
    }
}