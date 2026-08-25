package day15_sorting.ComparatorPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentNameComparator {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Sujeet");
        names.add("Rahul");
        names.add("Amit");
        names.add("Rohit");

        Comparator<String> nameComparator = new Comparator<String>() {

             @Override
             public int compare(String name1, String name2) {
                 return name1.compareTo(name2);
             }
        };

        Collections.sort(names, nameComparator);

        System.out.println(names);
    }
}