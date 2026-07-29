package day09_generics;

import java.util.Stack;

public class GenericStack<T> {

    private Stack<T> stack = new Stack<>();

    public void push(T value) {
        stack.push(value);
    }

    public T pop() {
        return stack.pop();
    }

    public T peek() {
        return stack.peek();
    }

    public static void main(String[] args) {

        GenericStack<String> stack = new GenericStack<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("html");


        System.out.println(stack.stack);

        System.out.println(stack.peek());
        System.out.println(stack.stack);

        System.out.println(stack.pop());
        System.out.println(stack.stack);

    }
}