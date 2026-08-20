package day14_traversal.EnhancedForPractice;

import java.util.HashSet;

public class HashSetEnhancedFor {

    public static void main(String[] args) {

        HashSet<String> skills = new HashSet<>();

        skills.add("Java");
        skills.add("SQL");
        skills.add("Selenium");
        skills.add("Git");

        for (String skill : skills) {

            System.out.println(skill);
        }
    }
}