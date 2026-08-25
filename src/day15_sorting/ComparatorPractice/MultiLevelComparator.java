package day15_sorting.ComparatorPractice;

import java.util.ArrayList;
import java.util.Comparator;

public class MultiLevelComparator {

    public static void main(String[] args) {

        ArrayList<StudentResult> students = new ArrayList<>();

        students.add(new StudentResult("Sujeet", 85));
        students.add(new StudentResult("Amit", 85));
        students.add(new StudentResult("Rahul", 70));
        students.add(new StudentResult("Rohit", 85));

        Comparator<StudentResult> comparator = Comparator.comparingInt(StudentResult::getMarks)
                .thenComparing(StudentResult::getName);

        students.sort(comparator);

        for (StudentResult student : students) {
            System.out.println(student);
        }
    }
}