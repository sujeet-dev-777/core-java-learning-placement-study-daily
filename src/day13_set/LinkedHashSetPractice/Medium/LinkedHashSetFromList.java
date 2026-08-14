package day13_set.LinkedHashSetPractice.Medium;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetFromList {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Amit");
        students.add("Sujeet");
        students.add("Rahul");
        students.add("Priya");
        students.add("Amit");

        System.out.println("Original List: " + students);

        LinkedHashSet<String> uniqueStudents = new LinkedHashSet<>(students);

        System.out.println("Unique Students: " + uniqueStudents);
    }
}