package day12_map.Challenge;

import java.util.HashMap;
import java.util.Map;

class Employee {

    private int employeeId;
    private String employeeName;
    private String department;
    private double salary;

    public Employee(
            int employeeId,
            String employeeName,
            String department,
            double salary) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {

        Map<Integer, Employee> employeeDatabase = new HashMap<>();

        employeeDatabase.put(101, new Employee(101, "Rahul", "Development", 65000));

        employeeDatabase.put(102, new Employee(102, "Priya", "Testing", 60000));

        employeeDatabase.put(103, new Employee(103, "Aman", "Development", 75000));

        employeeDatabase.put(104, new Employee(104, "Neha", "HR", 55000));

        System.out.println("=== Employee Database ===");

        displayEmployees(employeeDatabase);

        // Search employee
        int searchEmployeeId = 103;

        System.out.println("Searching Employee ID: " + searchEmployeeId);

        Employee employee = employeeDatabase.get(searchEmployeeId);

        if (employee != null) {

            System.out.println(employee.getEmployeeName() + " | " + employee.getDepartment() + " | ₹" + employee.getSalary());
        }

        // Update salary
        Employee employeeToUpdate = employeeDatabase.get(102);

        if (employeeToUpdate != null) {

            employeeToUpdate.setSalary(70000);
        }

        System.out.println("=== After Salary Update ===");

        displayEmployees(employeeDatabase);

        // Find highest salary
        Employee highestPaidEmployee = null;

        for (Employee currentEmployee : employeeDatabase.values()) {

            if (highestPaidEmployee == null || currentEmployee.getSalary() > highestPaidEmployee.getSalary()) {

                highestPaidEmployee = currentEmployee;
            }
        }

        System.out.println("=== Highest Paid Employee ===");

        System.out.println(highestPaidEmployee.getEmployeeName() + " | ₹" + highestPaidEmployee.getSalary());

        // Remove employee
        employeeDatabase.remove(104);

        System.out.println("=== After Removing Employee 104 ===");

        displayEmployees(employeeDatabase);
    }

    public static void displayEmployees(Map<Integer, Employee> employeeDatabase) {

        for (Employee employee : employeeDatabase.values()) {

            System.out.println(
                    employee.getEmployeeId() + " | " + employee.getEmployeeName() + " | " + employee.getDepartment() + " | ₹" + employee.getSalary());
        }
    }
}
















//Extra challenging question for this code


/*
Add:

Challenge 1

Find all employees from:

Development

Expected:

Rahul
Aman
Challenge 2

Find the average salary of all employees.

Challenge 3

Find the employee with the lowest salary.

Challenge 4

Count employees department-wise:

Development → 2
Testing     → 1
HR          → 1
Hint for Challenge 4

Think:

Map<String, Integer>

and use:

merge()

This is excellent interview practice.
*


* ```java
package day12_map.Challenge;

import java.util.HashMap;
import java.util.Map;

class Employee {

    private int employeeId;
    private String employeeName;
    private String department;
    private double salary;

    public Employee(
            int employeeId,
            String employeeName,
            String department,
            double salary) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {

        Map<Integer, Employee> employeeDatabase =
                new HashMap<>();

        // Adding employees
        employeeDatabase.put(
                101,
                new Employee(
                        101,
                        "Rahul",
                        "Development",
                        65000
                )
        );

        employeeDatabase.put(
                102,
                new Employee(
                        102,
                        "Priya",
                        "Testing",
                        60000
                )
        );

        employeeDatabase.put(
                103,
                new Employee(
                        103,
                        "Aman",
                        "Development",
                        75000
                )
        );

        employeeDatabase.put(
                104,
                new Employee(
                        104,
                        "Neha",
                        "HR",
                        55000
                )
        );

        System.out.println("=== Employee Database ===");

        displayEmployees(employeeDatabase);


        // ==========================================
        // Search Employee
        // ==========================================

        int searchEmployeeId = 103;

        System.out.println(
                "\nSearching Employee ID: "
                        + searchEmployeeId
        );

        Employee employee =
                employeeDatabase.get(searchEmployeeId);

        if (employee != null) {

            System.out.println(
                    employee.getEmployeeName()
                            + " | "
                            + employee.getDepartment()
                            + " | ₹"
                            + employee.getSalary()
            );
        }


        // ==========================================
        // Challenge 1
        // Find all employees from Development
        // ==========================================

        System.out.println(
                "\n=== Challenge 1: Development Employees ==="
        );

        for (Employee currentEmployee
                : employeeDatabase.values()) {

            if (currentEmployee.getDepartment()
                    .equals("Development")) {

                System.out.println(
                        currentEmployee.getEmployeeName()
                );
            }
        }


        // ==========================================
        // Challenge 2
        // Find Average Salary
        // ==========================================

        double totalSalary = 0;

        for (Employee currentEmployee
                : employeeDatabase.values()) {

            totalSalary += currentEmployee.getSalary();
        }

        double averageSalary =
                totalSalary / employeeDatabase.size();

        System.out.println(
                "\n=== Challenge 2: Average Salary ==="
        );

        System.out.println(
                "Average Salary: ₹"
                        + averageSalary
        );


        // ==========================================
        // Challenge 3
        // Find Employee With Lowest Salary
        // ==========================================

        Employee lowestPaidEmployee = null;

        for (Employee currentEmployee
                : employeeDatabase.values()) {

            if (lowestPaidEmployee == null
                    || currentEmployee.getSalary()
                    < lowestPaidEmployee.getSalary()) {

                lowestPaidEmployee = currentEmployee;
            }
        }

        System.out.println(
                "\n=== Challenge 3: Lowest Salary ==="
        );

        System.out.println(
                lowestPaidEmployee.getEmployeeName()
                        + " | ₹"
                        + lowestPaidEmployee.getSalary()
        );


        // ==========================================
        // Challenge 4
        // Count Employees Department-Wise
        // ==========================================

        Map<String, Integer> departmentCount =
                new HashMap<>();

        for (Employee currentEmployee
                : employeeDatabase.values()) {

            departmentCount.merge(
                    currentEmployee.getDepartment(),
                    1,
                    Integer::sum
            );
        }

        System.out.println(
                "\n=== Challenge 4: Department-Wise Count ==="
        );

        for (Map.Entry<String, Integer> entry
                : departmentCount.entrySet()) {

            System.out.println(
                    entry.getKey()
                            + " → "
                            + entry.getValue()
            );
        }


        // ==========================================
        // Update Salary
        // ==========================================

        Employee employeeToUpdate =
                employeeDatabase.get(102);

        if (employeeToUpdate != null) {

            employeeToUpdate.setSalary(70000);
        }

        System.out.println(
                "\n=== After Salary Update ==="
        );

        displayEmployees(employeeDatabase);


        // ==========================================
        // Find Highest Salary
        // ==========================================

        Employee highestPaidEmployee = null;

        for (Employee currentEmployee
                : employeeDatabase.values()) {

            if (highestPaidEmployee == null
                    || currentEmployee.getSalary()
                    > highestPaidEmployee.getSalary()) {

                highestPaidEmployee = currentEmployee;
            }
        }

        System.out.println(
                "\n=== Highest Paid Employee ==="
        );

        System.out.println(
                highestPaidEmployee.getEmployeeName()
                        + " | ₹"
                        + highestPaidEmployee.getSalary()
        );


        // ==========================================
        // Remove Employee
        // ==========================================

        employeeDatabase.remove(104);

        System.out.println(
                "\n=== After Removing Employee 104 ==="
        );

        displayEmployees(employeeDatabase);
    }


    // ==========================================
    // Display Employees
    // ==========================================

    public static void displayEmployees(
            Map<Integer, Employee> employeeDatabase) {

        for (Employee employee
                : employeeDatabase.values()) {

            System.out.println(
                    employee.getEmployeeId()
                            + " | "
                            + employee.getEmployeeName()
                            + " | "
                            + employee.getDepartment()
                            + " | ₹"
                            + employee.getSalary()
            );
        }
    }
}
```
*/