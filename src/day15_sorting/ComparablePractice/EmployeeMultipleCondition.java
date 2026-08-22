package day15_sorting.ComparablePractice;

import java.util.ArrayList;
import java.util.Collections;

class EmployeeDetails implements Comparable<EmployeeDetails> {

    private int employeeId;
    private String employeeName;
    private double salary;

    public EmployeeDetails(int employeeId, String employeeName, double salary) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    @Override
    public int compareTo(EmployeeDetails otherEmployee) {

        int salaryComparison = Double.compare(this.salary, otherEmployee.salary);

        if (salaryComparison != 0) {
            return salaryComparison;
        }

        return this.employeeName.compareTo(otherEmployee.employeeName);
    }

    @Override
    public String toString() {
        return employeeId + " - "
                + employeeName + " - "
                + salary;
    }
}

public class EmployeeMultipleCondition {

    public static void main(String[] args) {

        ArrayList<EmployeeDetails> employees = new ArrayList<>();

        employees.add(new EmployeeDetails(101, "Sujeet", 50000));

        employees.add(new EmployeeDetails(102, "Rahul", 40000));

        employees.add(new EmployeeDetails(103, "Amit", 50000));

        employees.add(new EmployeeDetails(104, "Rohit", 40000));

        Collections.sort(employees);

        for (EmployeeDetails employee : employees) {
            System.out.println(employee);
        }
    }
}