package day03_input_output;

import java.util.Scanner;

public class StudentInformation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        System.out.print("Enter Grade: ");
        char grade = sc.next().charAt(0);

        System.out.println("----- Student Details -----");
        System.out.println("Name  : " + name);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + grade);

        sc.close();
    }
}