package day12_map.InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

    public static void main(String[] args) {

        String input = "programming";

        System.out.println("Input : "+input);

        Map<Character, Integer> characterFrequency = new HashMap<>();

        for (char character : input.toCharArray()) {

            characterFrequency.put(character, characterFrequency.getOrDefault(character, 0) + 1);
        }

        System.out.println("Character Frequency:");

        for (Map.Entry<Character, Integer> entry : characterFrequency.entrySet()) {

            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}