package day12_map.TreeMapPractice;

import java.util.SortedMap;
import java.util.TreeMap;

public class SubMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        employeeMap.put(101, "Rahul");
        employeeMap.put(102, "virat");
        employeeMap.put(104, "gill");
        employeeMap.put(103, "sujeet");
        employeeMap.put(105, "Karan");

        SortedMap<Integer, String> subMap = employeeMap.subMap(102, 105);

        System.out.println("Employees Between 102 and 105:");
        System.out.println(subMap);
    }
}