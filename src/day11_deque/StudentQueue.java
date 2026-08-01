package day11_deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class StudentQueue {

    public static void main(String[] args) {

        Queue<String> students = new ArrayDeque<>();

        students.offer("sujeet");
        students.offer("Abhishek");
        students.offer("virat");
        students.offer("dhoni");

        System.out.println("Students in Queue: " + students);

        System.out.println("Processing Students:");

        while (!students.isEmpty()) {
            System.out.println(students.poll());
        }

        System.out.println("Queue After Processing: " + students);
    }
}