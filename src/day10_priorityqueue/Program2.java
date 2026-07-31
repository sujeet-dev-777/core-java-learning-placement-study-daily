package day10_priorityqueue;

import java.util.PriorityQueue;

public class Program2 {

    public static void main(String[] args) {

        PriorityQueue<String> students = new PriorityQueue<>();

        students.offer("Sujeet");
        students.offer("Rahul");
        students.offer("Amit");
        students.offer("Priya");
        students.offer("Neha");

//        System.out.println("Students:"+students);
        System.out.println("Students:");

        while (!students.isEmpty()) {

            System.out.println(students.poll());
        }
    }
}