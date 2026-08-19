package day14_traversal.ListIteratorPractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class ForwardBackwardListIterator {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        ListIterator<String> iterator = languages.listIterator();

        System.out.println("Forward traversal:");

        while (iterator.hasNext()) {

            String language = iterator.next();

            System.out.println(language);
        }

        System.out.println();

        System.out.println("Backward traversal:");

        while (iterator.hasPrevious()) {

            String language = iterator.previous();

            System.out.println(language);
        }
    }
}