package day10_queue;

import java.util.LinkedList;
import java.util.Queue;

public class StudentQueue {

    public static void main(String[] args) {

        Queue<String> students = new LinkedList<>();

        students.offer("Rahul");
        students.offer("Amit");
        students.offer("Sujeet");
        students.offer("Priya");

        while (!students.isEmpty()) {

            System.out.println("Processing : " + students.poll());
        }
    }
}