package day06_methods;

import java.util.Scanner;

public class FactorialMethod {

    public long factorial(int n) {

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        FactorialMethod obj = new FactorialMethod();

        System.out.println("Factorial = " + obj.factorial(number));

        sc.close();
    }
}