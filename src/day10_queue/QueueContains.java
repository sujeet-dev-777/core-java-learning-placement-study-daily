package day10_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueContains {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(100);
        queue.offer(200);
        queue.offer(300);
        queue.offer(400);

        int search = 300;

        if (queue.contains(search)) {
            System.out.println(search + " Found");
        } else {
            System.out.println(search + " Not Found");
        }
    }
}