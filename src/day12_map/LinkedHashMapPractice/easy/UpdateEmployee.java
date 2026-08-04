package day12_map.LinkedHashMapPractice.easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class UpdateEmployee {

    public static void main(String[] args) {

        Map<Integer, String> employees = new LinkedHashMap<>();

        employees.put(101, "Rahul");
        employees.put(102, "Amit");
        employees.put(103, "Priya");
        employees.put(104, "Neha");

        System.out.println("Before Update");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        employees.put(103, "Pooja");

        System.out.println("After Update");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}