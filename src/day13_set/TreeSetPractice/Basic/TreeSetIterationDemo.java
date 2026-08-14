package day13_set.TreeSetPractice.Basic;

import java.util.TreeSet;

public class TreeSetIterationDemo {

    public static void main(String[] args) {

        TreeSet<String> programmingLanguages = new TreeSet<>();

        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("C++");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("Go");

        System.out.println("Programming Languages:");

        for (String language : programmingLanguages) {
            System.out.println(language);
        }
    }
}