package day15_sorting.ComparatorPractice;

import java.util.ArrayList;
import java.util.Comparator;

public class ModernComparator {

    public static void main(String[] args) {

        ArrayList<StudentResult> students = new ArrayList<>();

        students.add(new StudentResult("Sujeet", 85));
        students.add(new StudentResult("Rahul", 95));
        students.add(new StudentResult("Amit", 72));

        Comparator<StudentResult> nameComparator = Comparator.comparing(StudentResult::getName);

        students.sort(nameComparator);

        for (StudentResult student : students) {
            System.out.println(student);
        }
    }
}