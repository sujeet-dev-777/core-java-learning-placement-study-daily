package day13_set.SetPlacementChallenges;

import java.util.HashSet;
import java.util.Set;

public class EmployeeIdSystem {

    public static void main(String[] args) {

        Set<Integer> employeeIds = new HashSet<>();

        employeeIds.add(1001);
        employeeIds.add(1002);
        employeeIds.add(1003);
        employeeIds.add(1002);

        System.out.println("Employee IDs: " + employeeIds);

        int searchId = 1002;

        if (employeeIds.contains(searchId)) {

            System.out.println("Employee ID " + searchId + " already exists.");

        } else {

            System.out.println("Employee ID " + searchId + " is available.");
        }
    }
}