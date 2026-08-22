package day15_sorting.ComparablePractice;

import java.util.ArrayList;
import java.util.Collections;

class SalaryEmployee implements Comparable<SalaryEmployee> {

    private int employeeId;
    private String employeeName;
    private double salary;

    public SalaryEmployee(int employeeId, String employeeName, double salary) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(SalaryEmployee otherEmployee) {

        return Double.compare(this.salary, otherEmployee.salary);
    }

    @Override
    public String toString() {
        return employeeId + " - " + employeeName + " - " + salary;
    }
}

public class HighestPaidEmployee {

    public static void main(String[] args) {

        ArrayList<SalaryEmployee> employees = new ArrayList<>();

        employees.add(new SalaryEmployee(101, "Sujeet", 60000));
        employees.add(new SalaryEmployee(102, "Rahul", 80000));
        employees.add(new SalaryEmployee(103, "Amit", 50000));

        Collections.sort(employees);

        SalaryEmployee highestPaidEmployee = employees.get(employees.size() - 1);

        System.out.println("Highest paid employee: " + highestPaidEmployee);
    }
}