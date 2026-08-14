package day13_set.TreeSetPractice.Medium;

import java.util.TreeSet;

public class StudentMarksRange {

    public static void main(String[] args) {

        TreeSet<Integer> marks = new TreeSet<>();

        marks.add(35);
        marks.add(42);
        marks.add(55);
        marks.add(61);
        marks.add(67);
        marks.add(72);
        marks.add(78);
        marks.add(85);
        marks.add(91);

        System.out.println("All Marks: " + marks);

        System.out.println("Lowest Mark: " + marks.first());

        System.out.println("Highest Mark: " + marks.last());

        System.out.println("First Mark Greater Than 70: " + marks.higher(70));

        System.out.println("First Mark At Least 70: " + marks.ceiling(70));

        System.out.println("Marks Below 60: " + marks.headSet(60));

        System.out.println("Marks From 60 to 80: " + marks.subSet(60, 80));

        System.out.println("Marks From 80: " + marks.tailSet(80));
    }
}