package day14_traversal.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveJavaLanguage {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Java");
        languages.add("C++");
        languages.add("JavaScript");

        System.out.println("Before removal: " + languages);

        Iterator<String> iterator = languages.iterator();

        while (iterator.hasNext()) {

            String language = iterator.next();

            if (language.equals("Java")) {
                iterator.remove();
            }
        }

        System.out.println("After removal: " + languages);
    }
}