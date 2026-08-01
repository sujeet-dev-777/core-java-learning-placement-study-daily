package day11_deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackDemo {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(10);
        stack.push(30);
        stack.push(60);
        stack.push(50);
        stack.push(40);

        System.out.println("Stack: " + stack);

        System.out.println("Popping Elements:");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}