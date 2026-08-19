package day14_traversal.ListIteratorPractice;

import java.util.ArrayList;
import java.util.ListIterator;

class StudentRecord {

    private int studentId;
    private String studentName;
    private int marks;

    public StudentRecord(int studentId, String studentName, int marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return studentName + " -> " + marks;
    }
}

public class RemoveFailedStudents {

    public static void main(String[] args) {

        ArrayList<StudentRecord> students = new ArrayList<>();

        students.add(new StudentRecord(101, "Sujeet", 85));
        students.add(new StudentRecord(102, "Rahul", 35));
        students.add(new StudentRecord(103, "Amit", 72));
        students.add(new StudentRecord(104, "Rohit", 28));
        students.add(new StudentRecord(105,"virat",99));

        ListIterator<StudentRecord> iterator = students.listIterator();

        while (iterator.hasNext()) {

            StudentRecord student = iterator.next();

            if (student.getMarks() < 40) {
                iterator.remove();
            }
        }

        System.out.println("Passed students:");

        for (StudentRecord student : students) {
            System.out.println(student);
        }
    }
}