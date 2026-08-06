package day12_map.HashtablePractice;

import java.util.Hashtable;

public class PutIfAbsentDemo {

    public static void main(String[] args) {

        Hashtable<Integer, String> employeeMap = new Hashtable<>();

        employeeMap.put(101, "Rahul");
        employeeMap.put(102, "Neha");

        employeeMap.putIfAbsent(104,"sujeet");

        employeeMap.putIfAbsent(102, "Priya");

        employeeMap.putIfAbsent(103, "Aman");

        System.out.println(employeeMap);
    }
}