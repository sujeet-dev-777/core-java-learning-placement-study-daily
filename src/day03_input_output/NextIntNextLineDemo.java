package day03_input_output;

import java.util.Scanner;

public class NextIntNextLineDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Age : " + age);
        System.out.println("Name: " + name);

        sc.close();
    }
}