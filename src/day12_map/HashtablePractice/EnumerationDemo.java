package day12_map.HashtablePractice;

import java.util.Enumeration;
import java.util.Hashtable;

public class EnumerationDemo {

    public static void main(String[] args) {

        Hashtable<Integer, String> employeeMap = new Hashtable<>();

        employeeMap.put(101, "Rahul");
        employeeMap.put(102, "Priya");
        employeeMap.put(103, "Aman");
        employeeMap.put(104, "Neha");

        System.out.println("Employee IDs:");

        Enumeration<Integer> employeeIds = employeeMap.keys();

        while (employeeIds.hasMoreElements()) {

            Integer employeeId = employeeIds.nextElement();

            System.out.println(employeeId);
        }

        System.out.println("Employee Names:");

        Enumeration<String> employeeNames = employeeMap.elements();

        while (employeeNames.hasMoreElements()) {

            String employeeName = employeeNames.nextElement();

            System.out.println(employeeName);
        }
    }
}