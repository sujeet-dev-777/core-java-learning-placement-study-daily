package day15_sorting.ComparatorPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentById {

    private int studentId;
    private String studentName;
    private int marks;

    public StudentById(int studentId, String studentName, int marks) {
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

public class StudentIdComparator {

    public static void main(String[] args) {

        ArrayList<StudentById> students = new ArrayList<>();

        students.add(new StudentById(103, "Amit", 75));
        students.add(new StudentById(101, "Sujeet", 85));
        students.add(new StudentById(102, "Rahul", 90));

        Comparator<StudentById> idComparator = new Comparator<StudentById>() {

            @Override
            public int compare(StudentById student1, StudentById student2) {

                return Integer.compare(student1.getStudentId(), student2.getStudentId() );
            }
        };

        Collections.sort(students, idComparator);

        for (StudentById student : students) {
            System.out.println(student);
        }
    }
}