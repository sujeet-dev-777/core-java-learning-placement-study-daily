package day13_utility_classes.CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;

public class MinMaxList {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(78);
        marks.add(92);
        marks.add(65);
        marks.add(88);
        marks.add(55);

        int highestMarks = Collections.max(marks);
        int lowestMarks = Collections.min(marks);

        System.out.println("Marks: " + marks);
        System.out.println("Highest marks: " + highestMarks);
        System.out.println("Lowest marks: " + lowestMarks);
    }
}