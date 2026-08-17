package day13_utility_classes.CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyList {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Java");
        languages.add("C++");
        languages.add("Java");

        int javaCount = Collections.frequency(languages, "Java");

        System.out.println("Languages: " + languages);
        System.out.println("Java appears: " + javaCount + " times");
    }
}