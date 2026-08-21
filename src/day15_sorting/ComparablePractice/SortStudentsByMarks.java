package day15_sorting.ComparablePractice;

import java.util.ArrayList;
import java.util.Collections;

class StudentMarks implements Comparable<StudentMarks> {

    private String studentName;
    private int marks;

    public StudentMarks(String studentName, int marks) {
        this.studentName = studentName;
        this.marks = marks;
    }

    @Override
    public int compareTo(StudentMarks otherStudent) {

        return Integer.compare(this.marks, otherStudent.marks);
    }

    @Override
    public String toString() {

        return studentName + " - " + marks;
    }
}

public class SortStudentsByMarks {

    public static void main(String[] args) {

        ArrayList<StudentMarks> students = new ArrayList<>();

        students.add(new StudentMarks("Sujeet", 85));
        students.add(new StudentMarks("Rahul", 65));
        students.add(new StudentMarks("Amit", 92));

        Collections.sort(students);

        for (StudentMarks student : students) {
            System.out.println(student);
        }
    }
}