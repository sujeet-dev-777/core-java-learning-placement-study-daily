package day14_traversal.ListIteratorPractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class UpdateLanguages {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Java");
        languages.add("SQL");

        System.out.println("Before Updated languages: " + languages);
        ListIterator<String> iterator = languages.listIterator();

        while (iterator.hasNext()) {

            String language = iterator.next();

            if (language.equals("Java")) {
                iterator.set("Core Java");
            }
        }

        System.out.println("After Updated languages: " + languages);
    }
}