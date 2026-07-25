package day06_methods;

import java.util.Scanner;

public class GCDRecursion {

    public int gcd(int a, int b) {

        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        GCDRecursion obj = new GCDRecursion();

        System.out.println("GCD = " + obj.gcd(a, b));

        sc.close();
    }
}
/*
* What is GCD?

The Greatest Common Divisor (GCD) is the largest positive integer that divides both numbers without leaving a remainder.

Example:
GCD(12, 18) = 6
* */