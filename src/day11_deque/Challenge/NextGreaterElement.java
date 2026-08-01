package day11_deque.Challenge;

import java.util.ArrayDeque;
import java.util.Deque;

public class NextGreaterElement {

    public static void main(String[] args) {

        int[] numbers = {4, 5, 2, 25};

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = numbers.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= numbers[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                System.out.println(numbers[i] + " -> -1");
            } else {
                System.out.println(numbers[i] + " -> " + stack.peek());
            }

            stack.push(numbers[i]);
        }
    }
}