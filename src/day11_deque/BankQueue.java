package day11_deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class BankQueue {

    public static void main(String[] args) {

        Queue<String> customers = new ArrayDeque<>();

        customers.offer("Suresh");
        customers.offer("Ramesh");
        customers.offer("Mahesh");
        customers.offer("Ganesh");
        customers.offer("Naresh");

        System.out.println("Customers: " + customers);

        System.out.println("First Customer: " + customers.peek());

        System.out.println("Serving: " + customers.poll());
        System.out.println("Serving: " + customers.poll());

        System.out.println("Remaining Customers:");
        System.out.println(customers);
    }
}