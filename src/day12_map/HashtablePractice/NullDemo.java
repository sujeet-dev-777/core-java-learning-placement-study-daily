package day12_map.HashtablePractice;

import java.util.Hashtable;

public class NullDemo {

    public static void main(String[] args) {

        Hashtable<Integer, String> employeeMap = new Hashtable<>();

        try {

            employeeMap.put(null, "Rahul");

        } catch (NullPointerException exception) {

            System.out.println("Null Key is Not Allowed");
        }

        try {

            employeeMap.put(101, null);

        } catch (NullPointerException exception) {

            System.out.println("Null Value is Not Allowed");
        }

        employeeMap.put(102, "Neha");

        System.out.println("Final Hashtable:");
        System.out.println(employeeMap);
    }
}