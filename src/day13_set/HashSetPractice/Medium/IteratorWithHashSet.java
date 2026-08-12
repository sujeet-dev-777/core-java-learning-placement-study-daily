package day13_set.HashSetPractice.Medium;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorWithHashSet {

    public static void main(String[] args) {

        HashSet<String> programmingLanguages = new HashSet<>();

        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("C++");

        Iterator<String> iterator = programmingLanguages.iterator();

        System.out.println("Programming Languages:");

        while (iterator.hasNext()) {

            String language = iterator.next();

            System.out.println(language);
        }
    }
}