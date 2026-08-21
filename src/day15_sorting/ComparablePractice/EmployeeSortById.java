package day15_sorting.ComparablePractice;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {

    private int employeeId;
    private String employeeName;
    private double salary;

    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        return Integer.compare(this.employeeId, otherEmployee.employeeId);
    }

    @Override
    public String toString() {
        return employeeId + " - " + employeeName + " - " + salary;
    }
}

public class EmployeeSortById {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(103, "Amit", 50000));
        employees.add(new Employee(101, "Sujeet", 60000));
        employees.add(new Employee(102, "Rahul", 55000));

        Collections.sort(employees);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}