package day13_set.SetPlacementChallenges;

import java.util.HashSet;
import java.util.Set;

public class FindCommonElements {

    public static void main(String[] args) {

        int[] departmentA = {101, 102, 103, 104, 105};

        int[] departmentB = {103, 104, 105, 106, 107};

        Set<Integer> employeesA = new HashSet<>();

        for (int employeeId : departmentA) {
            employeesA.add(employeeId);
        }

        Set<Integer> commonEmployees = new HashSet<>();

        for (int employeeId : departmentB) {

            if (employeesA.contains(employeeId)) {
                commonEmployees.add(employeeId);
            }
        }

        System.out.println("Common Employee IDs: " + commonEmployees);
    }
}