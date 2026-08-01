package day11_deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseString {

    public static void main(String[] args) {

        String word = "JAVA";

        Deque<Character> stack = new ArrayDeque<>();

        System.out.println(stack);

        for (char ch : word.toCharArray()) {
            stack.push(ch);
        }

        System.out.println(stack);
        System.out.print("Reversed String: ");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
        System.out.println(stack);
    }
}