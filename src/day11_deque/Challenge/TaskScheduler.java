package day11_deque.Challenge;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {

    public static void main(String[] args) {

        Queue<String> tasks = new ArrayDeque<>();

        tasks.offer("Task 1");
        tasks.offer("Task 2");
        tasks.offer("Task 3");
        tasks.offer("Task 4");

        while (!tasks.isEmpty()) {

            System.out.println("Executing: " + tasks.poll());
        }
    }
}