package day15_sorting.ComparatorPractice;

import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeSalaryAndName {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Sujeet", 50000));
        employees.add(new Employee(102, "Amit", 50000));
        employees.add(new Employee(103, "Rahul", 60000));
        employees.add(new Employee(104, "Rohit", 50000));

        employees.sort(Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getEmployeeName));

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}