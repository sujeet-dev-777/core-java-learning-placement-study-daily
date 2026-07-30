package day10_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInsert {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            queue.offer(i);
        }

        System.out.println("Queue: " + queue);
    }
}