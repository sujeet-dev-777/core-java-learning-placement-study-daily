package day14_traversal.IteratorPractice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {

    public static void main(String[] args) {

        HashSet<String> skills = new HashSet<>();

        skills.add("Java");
        skills.add("SQL");
        skills.add("Selenium");
        skills.add("Git");
        skills.add("Docker");

        Iterator<String> iterator = skills.iterator();

        while (iterator.hasNext()) {

            String skill = iterator.next();

            System.out.println(skill);
        }
    }
}