package day15_sorting.ComparatorPractice;

import java.util.ArrayList;
import java.util.Comparator;

public class LambdaComparator {

    public static void main(String[] args) {

        ArrayList<StudentResult> students = new ArrayList<>();

        students.add(new StudentResult("Sujeet", 85));
        students.add(new StudentResult("Rahul", 95));
        students.add(new StudentResult("Amit", 72));

        students.sort((student1, student2) -> Integer.compare(student1.getMarks(), student2.getMarks()));

        for (StudentResult student : students) {
            System.out.println(student);
        }
    }
}