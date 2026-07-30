package day10_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePeek {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Java");
        queue.offer("Python");
        queue.offer("C++");

        System.out.println("Queue : " + queue);
        System.out.println("Front Element : " + queue.peek());

        System.out.println("Queue After Peek : " + queue);
    }
}