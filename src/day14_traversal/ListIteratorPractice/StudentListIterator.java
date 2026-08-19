package day14_traversal.ListIteratorPractice;

import java.util.ArrayList;
import java.util.ListIterator;

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

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

public class StudentListIterator {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Sujeet", 85));
        students.add(new Student(102, "Rahul", 35));
        students.add(new Student(103, "Amit", 72));
        students.add(new Student(104, "Rohit", 28));

        ListIterator<Student> iterator = students.listIterator();

        while (iterator.hasNext()) {

            Student student = iterator.next();

            if (student.getMarks() < 40) {
                student.setMarks(40);
            }
        }

        for (Student student : students) {

            System.out.println(student.getStudentId() + " - " + student.getStudentName() +
                    " - " + student.getMarks());
        }
    }
}