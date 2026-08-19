package day14_traversal.IteratorPractice;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveFromHashSet {

    public static void main(String[] args) {

        HashSet<String> skills = new HashSet<>();

        skills.add("Java");
        skills.add("SQL");
        skills.add("Selenium");
        skills.add("Git");

        System.out.println("Before removal: " + skills);

        Iterator<String> iterator = skills.iterator();

        while (iterator.hasNext()) {

            String skill = iterator.next();

            if (skill.equals("SQL")) {
                iterator.remove();
            }
        }
        System.out.println("After removal: " + skills);
    }
}