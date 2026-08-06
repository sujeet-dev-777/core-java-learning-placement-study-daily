package day12_map.HashtablePractice;

import java.util.Hashtable;

public class ComputeMethodsDemo {

    public static void main(String[] args) {

        Hashtable<Integer, String> employeeMap = new Hashtable<>();

        employeeMap.put(101, "Rahul");
        System.out.println(employeeMap);

        employeeMap.computeIfAbsent(102, key -> "Neha");
        System.out.println(employeeMap);

        employeeMap.computeIfPresent(101, (key, value) -> value + " Kumar");
        employeeMap.computeIfPresent(103, (key, value) -> value + " Singh");
        System.out.println(employeeMap);

        employeeMap.computeIfAbsent(103,(key ) -> "sujeet");
        System.out.println(employeeMap);
        employeeMap.computeIfPresent(103, (key, value) -> value + " Sahani");
        System.out.println(employeeMap);

    }
}