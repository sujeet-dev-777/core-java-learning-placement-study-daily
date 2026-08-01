package day11_deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class StackSimulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Deque<Integer> stack = new ArrayDeque<>();

        int choice;

        do {

            System.out.println("===== Stack Menu =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Number: ");
                    int number = sc.nextInt();
                    stack.push(number);
                    System.out.println("Element Pushed.");
                    break;

                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is Empty.");
                    } else {
                        System.out.println("Popped: " + stack.pop());
                    }
                    break;

                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is Empty.");
                    } else {
                        System.out.println("Top Element: " + stack.peek());
                    }
                    break;

                case 4:
                    System.out.println("Stack: " + stack);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}