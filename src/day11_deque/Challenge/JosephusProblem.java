package day11_deque.Challenge;

import java.util.ArrayDeque;
import java.util.Queue;

public class JosephusProblem {

    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();

        int people = 7;
        int k = 3;

        for (int i = 1; i <= people; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {

            for (int i = 1; i < k; i++) {
                queue.offer(queue.poll());
            }

            System.out.println("Eliminated: " + queue.poll());
        }

        System.out.println("Winner: " + queue.peek());
    }
}