package day11_deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParentheses {

    public static void main(String[] args) {

        String expression = "((()))";

        Deque<Character> stack = new ArrayDeque<>();

        boolean balanced = true;

        for (char ch : expression.toCharArray()) {

            if (ch == '(') {

                stack.push(ch);

            } else if (ch == ')') {

                if (stack.isEmpty()) {
                    balanced = false;
                    break;
                }

                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            balanced = false;
        }

        if (balanced) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}