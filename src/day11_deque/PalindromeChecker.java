package day11_deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeChecker {

    public static void main(String[] args) {

        String word = "MADAM";

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is Not a Palindrome.");
        }
    }
}