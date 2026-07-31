package day10_priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Program4 {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(10);
        pq.offer(20);
        pq.offer(20);
        pq.offer(30);
        pq.offer(10);


        while (!pq.isEmpty()) {

            System.out.println(pq.poll());
        }
    }
}