package day10_priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Program3 {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        pq.offer(12);
        pq.offer(90);
        pq.offer(44);
        pq.offer(3);
        pq.offer(55);

        while (!pq.isEmpty()) {

            System.out.println(pq.poll());
        }
    }
}