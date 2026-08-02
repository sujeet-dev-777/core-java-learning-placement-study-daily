package day12_map.HashMapPractice;

import java.util.HashMap;
import java.util.Map;

public class EmployeeSalary {

    public static void main(String[] args) {

        HashMap<Integer, Double> employees = new HashMap<>();

        employees.put(101, 55000.0);
        employees.put(102, 62000.0);
        employees.put(103, 48000.0);
        employees.put(104, 75000.0);

        System.out.println("Employee Salary Details");

        for (Map.Entry<Integer, Double> entry : employees.entrySet()) {

            System.out.println("Employee ID : " + entry.getKey() + " Salary : " + entry.getValue());
        }

        System.out.println("Salary of Employee 102 : " + employees.get(102));

        employees.put(102, 68000.0);

        System.out.println("Updated Salary : " + employees.get(102));
    }
}