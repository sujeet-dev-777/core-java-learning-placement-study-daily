package day14_traversal.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

class Student {

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
}

public class StudentIterator {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Sujeet", 85));
        students.add(new Student(102, "Rahul", 35));
        students.add(new Student(103, "Amit", 75));
        students.add(new Student(104, "Rohit", 30));

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {

            Student student = iterator.next();

            if (student.getMarks() >= 40) {

                System.out.println(student.getStudentId() + " - " + student.getStudentName()
                        + " - " + student.getMarks());
            }
        }
    }
}