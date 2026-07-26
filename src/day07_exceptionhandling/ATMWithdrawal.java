package day07_exceptionhandling;

import java.util.Scanner;

public class ATMWithdrawal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        try {

            System.out.print("Enter Withdrawal Amount: ");
            double amount = sc.nextDouble();

            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than zero.");
            }

            if (amount > balance) {
                throw new ArithmeticException("Insufficient Balance.");
            }

            balance -= amount;

            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance = " + balance);

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("Thank You for Using Our ATM.");
            sc.close();
        }
    }
}