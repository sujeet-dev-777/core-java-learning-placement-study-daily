package day12_map.InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

        public static void main(String[] args) {

                String[] words = {
                        "eat",
                        "tea",
                        "tan",
                        "ate",
                        "nat",
                        "bat"
                };

                Map<String, List<String>> anagramGroups = new HashMap<>();

                for (String word : words) {

                        char[] characters = word.toCharArray();

                        Arrays.sort(characters);

                        String sortedWord = new String(characters);

                        anagramGroups.computeIfAbsent(sortedWord, key -> new ArrayList<>()).add(word);
                }

                System.out.println("Anagram Groups:");

                for (List<String> group : anagramGroups.values()) {
                        System.out.println(group);
                }
        }
}