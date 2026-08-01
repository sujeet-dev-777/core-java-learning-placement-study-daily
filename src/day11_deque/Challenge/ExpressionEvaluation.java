package day11_deque.Challenge;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExpressionEvaluation {

    public static void main(String[] args) {

        String expression = "23*54*+";

        Deque<Integer> stack = new ArrayDeque<>();

        for (char ch : expression.toCharArray()) {

            if (Character.isDigit(ch)) {

                stack.push(ch - '0');

            } else {

                int second = stack.pop();
                int first = stack.pop();

                switch (ch) {

                    case '+':
                        stack.push(first + second);
                        break;

                    case '-':
                        stack.push(first - second);
                        break;

                    case '*':
                        stack.push(first * second);
                        break;

                    case '/':
                        stack.push(first / second);
                        break;
                }
            }
        }

        System.out.println("Result = " + stack.pop());
    }
}