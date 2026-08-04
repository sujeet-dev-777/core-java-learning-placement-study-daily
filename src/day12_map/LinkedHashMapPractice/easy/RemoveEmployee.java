package day12_map.LinkedHashMapPractice.easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveEmployee {

    public static void main(String[] args) {

        Map<Integer, String> employees = new LinkedHashMap<>();

        employees.put(101, "Rahul");
        employees.put(102, "Amit");
        employees.put(103, "Priya");
        employees.put(104, "Neha");
        employees.put(105, "Karan");

        System.out.println("Before Remove");
        System.out.println("----------------");

        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        employees.remove(102);

        System.out.println("After Remove");
        System.out.println("----------------");

        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}