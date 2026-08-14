package day13_set.LinkedHashSetPractice.Basic;

import java.util.LinkedHashSet;

public class LinkedHashSetIterationDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> courses = new LinkedHashSet<>();

        courses.add("Java");
        courses.add("Selenium");
        courses.add("SQL");
        courses.add("Git");
        courses.add("Docker");

        System.out.println("Courses:" + courses);

        System.out.println("COURSES : ");

        for (String course : courses) {
            System.out.println(course);
        }
    }
}