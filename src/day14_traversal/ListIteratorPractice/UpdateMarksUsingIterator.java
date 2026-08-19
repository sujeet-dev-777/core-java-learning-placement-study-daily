package day14_traversal.ListIteratorPractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class UpdateMarksUsingIterator {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(75);
        marks.add(32);
        marks.add(85);
        marks.add(25);
        marks.add(60);

        ListIterator<Integer> iterator = marks.listIterator();

        while (iterator.hasNext()) {

            int mark = iterator.next();

            if (mark < 40) {
                iterator.set(40);
            }
        }

        System.out.println("Updated marks: " + marks);
    }
}