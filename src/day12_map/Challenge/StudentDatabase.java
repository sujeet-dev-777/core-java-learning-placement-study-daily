package day12_map.Challenge;

import java.util.HashMap;
import java.util.Map;

public class StudentDatabase {

    public static void main(String[] args) {

        Map<Integer, String> studentDatabase = new HashMap<>();

        // Add students
        studentDatabase.put(101, "Rahul");
        studentDatabase.put(102, "Priya");
        studentDatabase.put(103, "Aman");
        studentDatabase.put(104, "Neha");

        System.out.println("=== Student Database ===");

        displayStudents(studentDatabase);

        // Search student
        int searchStudentId = 102;

        System.out.println("Searching Student ID: " + searchStudentId);

        if (studentDatabase.containsKey(searchStudentId)) {

            System.out.println("Student Name: " + studentDatabase.get(searchStudentId));

        } else {

            System.out.println("Student Not Found");
        }

        // Update student
        studentDatabase.put(103, "Karan");

        System.out.println("After Updating Student 103:");

        displayStudents(studentDatabase);

        // Remove student
        studentDatabase.remove(104);

        System.out.println("After Removing Student 104:");

        displayStudents(studentDatabase);

        // Check size
        System.out.println("Total Students: " + studentDatabase.size());
    }

    public static void displayStudents(Map<Integer, String> studentDatabase) {

        for (Map.Entry<Integer, String> entry : studentDatabase.entrySet()) {

            System.out.println("ID: " + entry.getKey() + " | Name: " + entry.getValue());
        }
    }
}