package day15_sorting.ComparablePractice;

import java.util.ArrayList;
import java.util.Collections;

public class SortNames {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Sujeet");
        names.add("Rahul");
        names.add("Amit");
        names.add("Rohit");

        Collections.sort(names);

        System.out.println("Ascending: " + names);

        Collections.reverse(names);

        System.out.println("Descending: " + names);
    }
}