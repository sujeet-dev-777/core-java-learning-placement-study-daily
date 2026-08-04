package day12_map.LinkedHashMapPractice.medium;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentRecordSystem {

    public static void main(String[] args) {

        Map<Integer, String> students = new LinkedHashMap<>();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Student Record System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Update Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();


            switch (choice) {

                case 1:

                    System.out.print("Enter Roll Number: ");
                    int rollNo = sc.nextInt();

                    sc.nextLine();

                    if (students.containsKey(rollNo)) {
                        System.out.println("Student already exists");
                    }
                    else {
                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();

                        students.put(rollNo, name);

                        System.out.println("Student Added Successfully");
                    }

                    break;


                case 2:

                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll = sc.nextInt();

                    if (students.containsKey(searchRoll)) {

                        System.out.println(
                                "Student Found: " + students.get(searchRoll)
                        );

                    }
                    else {
                        System.out.println("Student Not Found");
                    }

                    break;


                case 3:

                    System.out.print("Enter Roll Number to Update: ");
                    int updateRoll = sc.nextInt();

                    sc.nextLine();

                    if (students.containsKey(updateRoll)) {

                        System.out.print("Enter New Name: ");
                        String newName = sc.nextLine();

                        students.put(updateRoll, newName);

                        System.out.println("Student Updated Successfully");

                    }
                    else {
                        System.out.println("Student Not Found");
                    }

                    break;


                case 4:

                    System.out.print("Enter Roll Number to Remove: ");
                    int removeRoll = sc.nextInt();

                    if (students.containsKey(removeRoll)) {

                        students.remove(removeRoll);

                        System.out.println("Student Removed Successfully");

                    }
                    else {
                        System.out.println("Student Not Found");
                    }

                    break;


                case 5:

                    if (students.isEmpty()) {

                        System.out.println("No Student Records Found");

                    }
                    else {

                        System.out.println("\nStudent Records");
                        System.out.println("----------------");

                        for (Map.Entry<Integer, String> entry : students.entrySet()) {

                            System.out.println(
                                    entry.getKey() + " -> " + entry.getValue()
                            );
                        }
                    }

                    break;


                case 6:

                    System.out.println("Exiting Program...");
                    sc.close();
                    System.exit(0);


                default:

                    System.out.println("Invalid Choice");

            }
        }
    }
}