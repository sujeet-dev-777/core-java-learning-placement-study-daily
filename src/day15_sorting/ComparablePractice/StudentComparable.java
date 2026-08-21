package day15_sorting.ComparablePractice;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {

    private int studentId;
    private String studentName;
    private int marks;

    public Student(int studentId, String studentName, int marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public int compareTo(Student otherStudent) {

        return Integer.compare(this.studentId, otherStudent.studentId);
    }

    @Override
    public String toString() {

        return studentId + " - " + studentName + " - " + marks;
    }
}

public class StudentComparable {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, "Amit", 75));
        students.add(new Student(101, "Sujeet", 85));
        students.add(new Student(102, "Rahul", 90));

        System.out.println("Before sorting:");

        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students);

        System.out.println("After sorting by ID:");

        for (Student student : students) {
            System.out.println(student);
        }
    }
}