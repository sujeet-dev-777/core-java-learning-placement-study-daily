package day10_queue;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Java");
        queue.offer("Python");
        queue.offer("SQL");

        System.out.println("Queue: " + queue);

        System.out.println("Peek: " + queue.peek());

        System.out.println("Removed: " + queue.poll());

        System.out.println("After Remove: " + queue);

        System.out.println("Contains Java: " + queue.contains("Java"));

        System.out.println("Size: " + queue.size());

        System.out.println("Is Empty: " + queue.isEmpty());
    }
}