package day15_sorting.ComparatorPractice;

import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeNameSorting {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Sujeet", 60000));
        employees.add(new Employee(102, "Rahul", 45000));
        employees.add(new Employee(103, "Amit", 75000));
        employees.add(new Employee(104, "Rohit", 55000));

        employees.sort(Comparator.comparing(Employee::getEmployeeName));

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}