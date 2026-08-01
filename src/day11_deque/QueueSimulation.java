package day11_deque;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueSimulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new ArrayDeque<>();

        int choice;

        do {

            System.out.println("===== Queue Menu =====");
            System.out.println("1. Add Customer");
            System.out.println("2. Serve Customer");
            System.out.println("3. Show First Customer");
            System.out.println("4. Display Queue");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Customer Name: ");
                    String customer = sc.nextLine();
                    queue.offer(customer);
                    System.out.println("Customer Added.");
                    break;

                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is Empty.");
                    } else {
                        System.out.println("Serving: " + queue.poll());
                    }
                    break;

                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is Empty.");
                    } else {
                        System.out.println("First Customer: " + queue.peek());
                    }
                    break;

                case 4:
                    System.out.println("Queue: " + queue);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}