package day11_deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class RailwayTicketQueue {

    public static void main(String[] args) {

        Queue<String> customers = new ArrayDeque<>();

        customers.offer("sujeet");
        customers.offer("virat");
        customers.offer("rohit");
        customers.offer("dhoni");

        System.out.println("Customers Waiting: " + customers);

        System.out.println("Serving Customers:");

        while (!customers.isEmpty()) {

            String customer = customers.poll();

            System.out.println(customer + " got ticket");
        }

        System.out.println("All customers served.");

        System.out.println("Customers Waiting: " + customers);

    }
}