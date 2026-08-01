package day11_deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class UndoFeature {

    public static void main(String[] args) {

        Deque<String> operations = new ArrayDeque<>();

        operations.push("Type A");
        operations.push("Type B");
        operations.push("Type C");

        System.out.println("Before Undo: " + operations);

        System.out.println("Undo: " + operations.pop());
        System.out.println("Undo: " + operations.pop());

        System.out.println("Remaining Operations:");

        while (!operations.isEmpty()) {
            System.out.println(operations.pop());
        }
    }
}