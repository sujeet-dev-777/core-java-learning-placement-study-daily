package day13_set.LinkedHashSetPractice.Medium;

import java.util.LinkedHashSet;

public class RemoveDuplicatesPreserveOrder {

    public static void main(String[] args) {

        String[] languages = {
                "Java",
                "Python",
                "Java",
                "Selenium",
                "Python",
                "SQL",
                "Selenium"
        };

        LinkedHashSet<String> uniqueLanguages = new LinkedHashSet<>();

        for (String language : languages) {
            uniqueLanguages.add(language);
        }

        System.out.println("Unique Languages: " + uniqueLanguages);
    }
}