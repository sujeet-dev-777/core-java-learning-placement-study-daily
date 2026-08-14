package day13_set.LinkedHashSetPractice.InterviewPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String text = "swisshhtttzz";

        HashSet<Character> seenCharacters = new HashSet<>();
        LinkedHashSet<Character> nonRepeatingCharacters = new LinkedHashSet<>();

        for (char character : text.toCharArray()) {

            if (!seenCharacters.add(character)) {
                nonRepeatingCharacters.remove(character);
            } else {
                nonRepeatingCharacters.add(character);
            }
        }

        if (!nonRepeatingCharacters.isEmpty()) {
            System.out.println("First Non-Repeating Character: " + nonRepeatingCharacters.iterator().next());
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}