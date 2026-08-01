package day11_deque.Challenge;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ReverseFirstKElements {

    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        int k = 3;

        System.out.println("Original Queue : " + queue);

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        int remaining = queue.size() - (queue.size() - k);

        for (int i = 0; i < queue.size() - k; i++) {
            queue.offer(queue.poll());
        }

        System.out.println("Modified Queue : " + queue);
    }
}