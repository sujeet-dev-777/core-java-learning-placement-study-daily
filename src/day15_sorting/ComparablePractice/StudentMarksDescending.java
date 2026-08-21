package day15_sorting.ComparablePractice;

import java.util.ArrayList;
import java.util.Collections;

class StudentResult implements Comparable<StudentResult> {

    private int studentId;
    private String studentName;
    private int marks;

    public StudentResult(int studentId, String studentName, int marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
    }

    @Override
    public int compareTo(StudentResult otherStudent) {

        return Integer.compare(
                otherStudent.marks,
                this.marks
        );
    }

    @Override
    public String toString() {
        return studentId + " - "
                + studentName + " - "
                + marks;
    }
}

public class StudentMarksDescending {

    public static void main(String[] args) {

        ArrayList<StudentResult> students = new ArrayList<>();

        students.add(new StudentResult(101, "Sujeet", 85));
        students.add(new StudentResult(102, "Rahul", 95));
        students.add(new StudentResult(103, "Amit", 72));
        students.add(new StudentResult(104, "Rohit", 90));

        Collections.sort(students);

        for (StudentResult student : students) {
            System.out.println(student);
        }
    }
}