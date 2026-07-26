package day07_exceptionhandling;

import java.util.Scanner;

public class BankTransaction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double senderBalance = 10000;
        double receiverBalance = 5000;

        try {

            System.out.print("Enter Transfer Amount: ");
            double amount = sc.nextDouble();

            if (amount <= 0) {
                throw new IllegalArgumentException("Invalid Amount.");
            }

            if (amount > senderBalance) {
                throw new ArithmeticException("Insufficient Balance.");
            }

            senderBalance -= amount;
            receiverBalance += amount;

            System.out.println("Transaction Successful");

            System.out.println("Sender Balance   : " + senderBalance);
            System.out.println("Receiver Balance : " + receiverBalance);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        } finally {

            System.out.println("Transaction Completed.");
            sc.close();
        }
    }
}