package day03_input_output;

import java.util.Scanner;

public class ReadBoolean {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Boolean Value (true/false): ");

        boolean value = sc.nextBoolean();

        System.out.println("Boolean Value = " + value);

        sc.close();
    }
}