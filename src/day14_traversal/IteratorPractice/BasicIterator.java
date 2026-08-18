package day14_traversal.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class BasicIterator {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        Iterator<String> iterator = languages.iterator();

        while (iterator.hasNext()){
            String language = iterator.next();
            System.out.println(language);
        }







//        Iterator<String> iterator = languages.iterator();
//
//        while (iterator.hasNext()) {
//
//            String language = iterator.next();
//
//            System.out.println(language);
//        }
    }
}