package day13_set.HashSetPractice.Basic;

import java.util.HashSet;

public class HashSetRemoveDemo {

    public static void main(String[] args) {

        HashSet<String> courses = new HashSet<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("SQL");
        courses.add("Selenium");

        System.out.println("Courses before removal: " + courses);

        boolean removed = courses.remove("Python");

        System.out.println("Was Python removed? " + removed);
        System.out.println("Courses after removal: " + courses);
    }
}