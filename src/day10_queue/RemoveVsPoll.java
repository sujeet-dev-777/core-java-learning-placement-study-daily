package day10_queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class RemoveVsPoll {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        try {

            System.out.println("remove() : " + queue.remove());

        } catch (NoSuchElementException e) {

            System.out.println("remove() throws NoSuchElementException");
        }

        System.out.println("poll() : " + queue.poll());
    }
}