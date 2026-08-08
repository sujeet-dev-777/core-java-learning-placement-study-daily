package day12_map.InterviewPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        String input = "programming";

        Map<Character, Integer> characterFrequency = new LinkedHashMap<>();

        for (char character : input.toCharArray()) {

            characterFrequency.put(character, characterFrequency.getOrDefault(character, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : characterFrequency.entrySet()) {

            if (entry.getValue() == 1) {

                System.out.println("First Non-Repeated Character: " + entry.getKey());

                break;
            }
        }
    }
}