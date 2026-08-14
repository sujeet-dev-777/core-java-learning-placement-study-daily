package day13_set.LinkedHashSetPractice.InterviewPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicatesPreserveOrderAdvanced {

    public static void main(String[] args) {

        String sentence = "Java Java Python SQL Java Python Selenium";

        String[] words = sentence.split(" ");

        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>();

        for (String word : words) {
            uniqueWords.add(word);
        }

        System.out.println("Original Sentence:");
        System.out.println(sentence);

        System.out.println("After Removing Duplicates:");

        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }
    }
}