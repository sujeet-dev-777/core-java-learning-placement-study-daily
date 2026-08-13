package day13_set.HashSetPractice.InterviewPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesPreserveOrder {

    public static void main(String[] args) {

        String[] languages = {
                "Java",
                "Python",
                "Java",
                "Selenium",
                "Python",
                "SQL"
        };

        Set<String> uniqueLanguages = new LinkedHashSet<>();

        for (String language : languages) {
            uniqueLanguages.add(language);
        }

        System.out.println("Original Array:");

        for (String language : languages) {
            System.out.println(language);
        }

        System.out.println("After Removing Duplicates:");

        for (String language : uniqueLanguages) {
            System.out.println(language);
        }
    }
}