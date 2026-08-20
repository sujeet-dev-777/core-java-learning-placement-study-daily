package day14_traversal.EnhancedForPractice;

import java.util.ArrayList;

public class BasicEnhancedFor {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        for (String language : languages) {

            System.out.println(language);
        }
    }
}