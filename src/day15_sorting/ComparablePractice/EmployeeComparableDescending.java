package day15_sorting.ComparablePractice;

import java.util.ArrayList;
import java.util.Collections;

class Employee1 implements Comparable<Employee1> {

    private int employeeId;
    private String employeeName;

    public Employee1(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    @Override
    public int compareTo(Employee1 otherEmployee) {

        return Integer.compare(otherEmployee.employeeId, this.employeeId);
    }

    @Override
    public String toString() {

        return employeeId + " - " + employeeName;
    }
}

public class EmployeeComparableDescending {

    public static void main(String[] args) {

        ArrayList<Employee1> employees = new ArrayList<>();

        employees.add(new Employee1(103, "Amit"));
        employees.add(new Employee1(101, "Sujeet"));
        employees.add(new Employee1(102, "Rahul"));

        Collections.sort(employees);

        for (Employee1 employee : employees) {
            System.out.println(employee);
        }
    }
}