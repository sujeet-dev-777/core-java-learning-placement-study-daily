package day10_priorityqueue;

import java.util.PriorityQueue;

public class Program1 {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(45);
        pq.offer(10);
        pq.offer(70);
        pq.offer(25);
        pq.offer(5);

        System.out.println("Elements in Priority Order:");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
//        System.out.println(pq.poll());
    }
}