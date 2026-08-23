package day15_sorting.ComparatorPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    @Override
    public String toString() {
        return studentId + " - " + studentName + " - " + marks;
    }
}

public class StudentMarksComparator {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Sujeet", 85));
        students.add(new Student(102, "Rahul", 65));
        students.add(new Student(103, "Amit", 92));

        Comparator<Student> marksComparator =
                new Comparator<Student>() {

                    @Override
                    public int compare(Student student1, Student student2) {

                        return Integer.compare(student1.getMarks(), student2.getMarks());
                    }
                };

        Collections.sort(students, marksComparator);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}