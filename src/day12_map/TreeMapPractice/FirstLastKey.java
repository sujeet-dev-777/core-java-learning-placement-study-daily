package day12_map.TreeMapPractice;

import java.util.TreeMap;

public class FirstLastKey {

    public static void main(String[] args) {

        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        employeeMap.put(105, "Rahul");
        employeeMap.put(101, "Virat");
        employeeMap.put(108, "Rohit");
        employeeMap.put(103, "Sujeet");

        System.out.println("First Key : " + employeeMap.firstKey());
        System.out.println("Last Key  : " + employeeMap.lastKey());
    }
}