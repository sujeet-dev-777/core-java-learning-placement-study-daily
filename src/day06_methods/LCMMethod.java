package day06_methods;

import java.util.Scanner;

public class LCMMethod {

    public int gcd(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public int lcm(int a, int b) {

        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        LCMMethod obj = new LCMMethod();

        System.out.println("LCM = " + obj.lcm(a, b));

        sc.close();
    }
}

/*
* What is LCM?

The Least Common Multiple (LCM) is the smallest positive number that is exactly divisible by both numbers.

Example:
LCM(4, 6) = 12
* */