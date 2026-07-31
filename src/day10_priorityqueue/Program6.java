package day10_priorityqueue;

import java.util.PriorityQueue;

public class Program6 {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(80);
        pq.offer(20);
        pq.offer(60);
        pq.offer(10);
        pq.offer(40);

        System.out.println("queue : " + pq);
        System.out.println(pq.size());
        System.out.println(pq.isEmpty());
        System.out.println(pq.contains(50));


        System.out.println(pq);

        while (!pq.isEmpty()) {

            System.out.println("Removed : " + pq.poll());
        }

        System.out.println("Queue = " + pq);
//        pq.clear();
        System.out.println("Queue = " + pq);
    }
}