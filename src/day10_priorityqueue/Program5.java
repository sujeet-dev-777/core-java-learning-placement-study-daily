package day10_priorityqueue;

import java.util.PriorityQueue;

public class Program5 {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(40);
        pq.offer(15);
        pq.offer(90);
        pq.offer(5);
        pq.offer(60);

        System.out.println("Queue = " + pq);


        System.out.println("Smallest Element = " + pq.peek());

        System.out.println("Queue = " + pq);
    }
}