package day03_input_output;

import java.util.Scanner;

public class ReadDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Decimal Number: ");

        double number = sc.nextDouble();

        System.out.printf("Number = %.2f", number);

        sc.close();
    }
}