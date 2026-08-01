package day11_deque.Challenge;

import java.util.ArrayDeque;
import java.util.Deque;

public class StockSpanProblem {

    public static void main(String[] args) {

        int[] price = {100, 80, 60, 70, 60, 75, 85};

        int[] span = new int[price.length];

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(0);
        span[0] = 1;

        for (int i = 1; i < price.length; i++) {

            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }

        System.out.println("Stock Span:");

        for (int value : span) {
            System.out.println(value);
        }
    }
}