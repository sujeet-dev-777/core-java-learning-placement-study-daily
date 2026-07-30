package day10_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEmpty {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= 5; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {

            System.out.println("Removed : " + queue.poll());
        }

        System.out.println("Queue : " + queue);
    }
}