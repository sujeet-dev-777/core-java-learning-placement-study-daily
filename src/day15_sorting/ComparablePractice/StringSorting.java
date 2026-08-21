package day15_sorting.ComparablePractice;

import java.util.ArrayList;
import java.util.Collections;

public class StringSorting {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Sujeet");
        names.add("Amit");
        names.add("Rahul");
        names.add("Rohit");

        Collections.sort(names);

        System.out.println(names);
    }
}