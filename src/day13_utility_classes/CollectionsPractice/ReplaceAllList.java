package day13_utility_classes.CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ReplaceAllList {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Java");
        languages.add("C++");
        languages.add("Java");

        System.out.println("Before replacement: " + languages);

        Collections.replaceAll(languages, "Java", "SQL");

        System.out.println("After replacement: " + languages);
    }
}