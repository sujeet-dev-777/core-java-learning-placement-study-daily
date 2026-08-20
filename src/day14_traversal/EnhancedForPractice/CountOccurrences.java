package day14_traversal.EnhancedForPractice;

import java.util.ArrayList;

public class CountOccurrences {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Java");
        languages.add("C++");
        languages.add("Java");

        String searchLanguage = "Java";
        int count = 0;

        for (String language : languages) {

            if (language.equals(searchLanguage)) {
                count++;
            }
        }

        System.out.println(searchLanguage + " appears " + count + " times.");
    }
}