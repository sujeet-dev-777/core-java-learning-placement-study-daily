package day06_methods;

import java.util.Scanner;

public class FibonacciMethod {

    public void fibonacci(int terms) {

        int first = 0;
        int second = 1;

        for (int i = 1; i <= terms; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Terms: ");
        int terms = sc.nextInt();

        FibonacciMethod obj = new FibonacciMethod();

        System.out.println("Fibonacci Series:");
        obj.fibonacci(terms);

        sc.close();
    }
}