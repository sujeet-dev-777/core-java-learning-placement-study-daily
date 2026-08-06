package day12_map.HashtablePractice;

import java.util.Hashtable;

public class ReplaceDemo {

    public static void main(String[] args) {

        Hashtable<Integer, String> employeeMap = new Hashtable<>();

        employeeMap.put(101, "Rahul");
        employeeMap.put(102, "Neha");

        employeeMap.replace(102, "sujeet");
        System.out.println(employeeMap);

        boolean updated = employeeMap.replace(101,"Rahul","Virat");

        System.out.println("Updated : " + updated);

        System.out.println(employeeMap);
    }
}