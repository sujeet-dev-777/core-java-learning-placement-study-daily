package day12_map.HashMapPractice;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

    public static void main(String[] args) {

        String sentence = "java is easy java is powerful java";

        String[] words = sentence.split(" ");

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {

            if (frequency.containsKey(word)) {

                frequency.put(word, frequency.get(word) + 1);

            } else {

                frequency.put(word, 1);
            }
        }

        System.out.println("Word Frequency");

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {

            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}