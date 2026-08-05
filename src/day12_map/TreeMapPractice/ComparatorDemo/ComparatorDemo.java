package day12_map.TreeMapPractice.ComparatorDemo;


import java.util.TreeMap;

public class ComparatorDemo {

    public static void main(String[] args) {

        TreeMap<Student, Integer> studentMarks = new TreeMap<>(new StudentNameComparator());

        studentMarks.put(new Student(103, "Rahul"), 85);
        studentMarks.put(new Student(101, "sujeet"), 91);
        studentMarks.put(new Student(105, "virat"), 76);
        studentMarks.put(new Student(102, "rohit"), 88);

        System.out.println("Students Sorted By Name");

        studentMarks.forEach((student, marks) ->
                System.out.println(student + " -> " + marks));
    }
}