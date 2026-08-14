package day13_set.LinkedHashSetPractice.Basic;

import java.util.LinkedHashSet;

public class BasicLinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> languages = new LinkedHashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Java");
        languages.add("Selenium");
//        languages.add("Python");
        languages.add("SQL");

        System.out.println("Programming Languages: " + languages);
    }
}