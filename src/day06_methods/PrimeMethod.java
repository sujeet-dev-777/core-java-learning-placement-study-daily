package day06_methods;

import java.util.Scanner;

public class PrimeMethod {

    public boolean isPrime(int number) {

        if (number <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        PrimeMethod obj = new PrimeMethod();

        if (obj.isPrime(number))
            System.out.println(number + " is Prime");
        else
            System.out.println(number + " is Not Prime");

        sc.close();
    }
}