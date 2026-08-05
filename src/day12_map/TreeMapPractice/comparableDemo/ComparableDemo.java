package day12_map.TreeMapPractice.comparableDemo;

import java.util.TreeMap;

public class ComparableDemo {

    public static void main(String[] args) {

        TreeMap<Student, Integer> studentMarks = new TreeMap<>();

        studentMarks.put(new Student(103, "Rahul"), 85);
        studentMarks.put(new Student(101, "Neha"), 91);
        studentMarks.put(new Student(105, "Aman"), 76);
        studentMarks.put(new Student(102, "Priya"), 88);

        System.out.println("Students Sorted By Roll Number");

        studentMarks.forEach((student, marks) -> System.out.println(student + " -> " + marks));
    }
}