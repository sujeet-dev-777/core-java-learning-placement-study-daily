package day13_set.HashSetPractice.Basic;

import java.util.HashSet;

public class HashSetIterationDemo {

    public static void main(String[] args) {

        HashSet<String> programmingLanguages = new HashSet<>();

        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("C++");

        System.out.println("Programming Languages:");

        for (String language : programmingLanguages) {
            System.out.println(language);
        }
    }
}