package day10_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePoll {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 10; i <= 100; i += 10) {
            queue.offer(i);
        }

        System.out.println("Original Queue : " + queue);

        System.out.println("Removed : " + queue.poll());
        System.out.println("Removed : " + queue.poll());

        System.out.println("Queue After Removal : " + queue);
    }
}