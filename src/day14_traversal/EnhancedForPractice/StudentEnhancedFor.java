package day14_traversal.EnhancedForPractice;

import java.util.ArrayList;

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

public class StudentEnhancedFor {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Sujeet", 85));
        students.add(new Student(102, "Rahul", 72));
        students.add(new Student(103, "Amit", 91));

        for (Student student : students) {

            System.out.println(student.getStudentId() + " - " + student.getStudentName() + " - "
                    + student.getMarks());
        }
    }
}