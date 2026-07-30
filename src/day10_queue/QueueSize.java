package day10_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSize {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println("Queue : " + queue);
        System.out.println("Total Elements : " + queue.size());
    }
}