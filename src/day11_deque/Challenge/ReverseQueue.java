package day11_deque.Challenge;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ReverseQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println("Original Queue : " + queue);

        Deque<Integer> stack = new ArrayDeque<>();

        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        System.out.println("Reversed Queue : " + queue);
    }
}