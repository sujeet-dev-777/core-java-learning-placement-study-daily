package day12_map.InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

    public static void main(String[] args) {

        String input = "programming";

        Map<Character, Integer> characterFrequency = new HashMap<>();

        for (char character : input.toCharArray()) {

            characterFrequency.put(character, characterFrequency.getOrDefault(character, 0) + 1);
        }

        System.out.println("Duplicate Characters:");

        for (Map.Entry<Character, Integer> entry : characterFrequency.entrySet()) {

            if (entry.getValue() > 1) {

                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}