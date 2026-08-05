package day12_map.TreeMapPractice.CustomObjectSorting;

import java.util.TreeMap;

public class CustomObjectSorting {

    public static void main(String[] args) {

        TreeMap<Integer, Student> rankList = new TreeMap<>(new StudentMarksComparator());

        rankList.put(85, new Student(103, "Rahul"));
        rankList.put(91, new Student(101, "sujeet"));
        rankList.put(76, new Student(105, "virat"));
        rankList.put(88, new Student(102, "rohit"));

        System.out.println("Students Sorted By Marks (Highest First)");

        rankList.forEach((marks, student) -> System.out.println(marks + " -> " + student));
    }
}