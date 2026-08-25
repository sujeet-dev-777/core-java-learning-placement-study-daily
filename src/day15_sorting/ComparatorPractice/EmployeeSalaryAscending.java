package day15_sorting.ComparatorPractice;

import java.util.ArrayList;
import java.util.Comparator;

class Employee {

    private int employeeId;
    private String employeeName;
    private double salary;

    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return employeeId + " - " + employeeName + " - " + salary;
    }
}

public class EmployeeSalaryAscending {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Sujeet", 60000));
        employees.add(new Employee(102, "Rahul", 45000));
        employees.add(new Employee(103, "Amit", 75000));
        employees.add(new Employee(104, "Rohit", 55000));

        employees.sort(Comparator.comparingDouble(Employee::getSalary));

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}