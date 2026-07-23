package day06_methods;

import java.util.Scanner;

public class ReverseNumberMethod {

    public int reverse(int number) {

        int reverse = 0;

        while (number != 0) {

            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        ReverseNumberMethod obj = new ReverseNumberMethod();

        System.out.println("Reversed Number = " + obj.reverse(number));

        sc.close();
    }
}