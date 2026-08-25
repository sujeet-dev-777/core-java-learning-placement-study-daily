package day15_sorting.ComparatorPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentResult {

    private String name;
    private int marks;

    public StudentResult(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class MarksDescendingComparator {

    public static void main(String[] args) {

        ArrayList<StudentResult> students = new ArrayList<>();

        students.add(new StudentResult("Sujeet", 85));
        students.add(new StudentResult("Rahul", 95));
        students.add(new StudentResult("Amit", 72));

        Comparator<StudentResult> marksDescending = new Comparator<StudentResult>() {

                    @Override
                    public int compare(StudentResult student1, StudentResult student2) {

                        return Integer.compare(student2.getMarks(), student1.getMarks());
                    }
                };

        Collections.sort(students, marksDescending);

        for (StudentResult student : students) {
            System.out.println(student);
        }
    }
}