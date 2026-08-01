package day11_deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeBasicDemo {

    public static void main(String[] args) {

        // Creating a Deque
        Deque<Integer> deque = new ArrayDeque<>();

        System.out.println("========== ADD ELEMENTS ==========");
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);

        System.out.println("Deque : " + deque);

        // ----------------------------------------------------

        System.out.println("\n========== INSERT FRONT ==========");
        deque.addFirst(5);
        deque.offerFirst(1);

        System.out.println("After addFirst() and offerFirst()");
        System.out.println(deque);

        // ----------------------------------------------------

        System.out.println("\n========== INSERT REAR ==========");
        deque.addLast(60);
        deque.offerLast(70);

        System.out.println("After addLast() and offerLast()");
        System.out.println(deque);

        // ----------------------------------------------------

        System.out.println("\n========== PEEK OPERATIONS ==========");

        System.out.println("peek()       : " + deque.peek());
        System.out.println("peekFirst()  : " + deque.peekFirst());
        System.out.println("peekLast()   : " + deque.peekLast());

        // ----------------------------------------------------

        System.out.println("\n========== REMOVE FRONT ==========");

        System.out.println("removeFirst(): " + deque.removeFirst());
        System.out.println("pollFirst() : " + deque.pollFirst());

        System.out.println("Deque : " + deque);

        // ----------------------------------------------------

        System.out.println("\n========== REMOVE REAR ==========");

        System.out.println("removeLast(): " + deque.removeLast());
        System.out.println("pollLast() : " + deque.pollLast());

        System.out.println("Deque : " + deque);

        // ----------------------------------------------------

        System.out.println("\n========== SEARCH ELEMENT ==========");

        int search = 30;

        if (deque.contains(search)) {
            System.out.println(search + " Found");
        } else {
            System.out.println(search + " Not Found");
        }

        // ----------------------------------------------------

        System.out.println("\n========== COUNT ELEMENTS ==========");

        System.out.println("Size : " + deque.size());

        // ----------------------------------------------------

        System.out.println("\n========== CHECK EMPTY ==========");

        System.out.println("Is Empty : " + deque.isEmpty());

        // ----------------------------------------------------

        System.out.println("\n========== ITERATING ==========");

        System.out.print("Forward : ");
        for (Integer num : deque) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.print("Reverse : ");
        for (Integer num : deque) {
            System.out.print(num + " ");
        }

        System.out.println();

        // ----------------------------------------------------

        System.out.println("\n========== CLEAR DEQUE ==========");

        deque.clear();

        System.out.println("Deque : " + deque);
        System.out.println("Is Empty : " + deque.isEmpty());
    }
}