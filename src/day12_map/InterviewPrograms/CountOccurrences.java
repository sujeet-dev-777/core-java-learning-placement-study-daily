package day12_map.InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrences {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 20, 10};

        Map<Integer, Integer> occurrenceMap = new HashMap<>();

        for (int number : numbers) {

            occurrenceMap.put(number, occurrenceMap.getOrDefault(number, 0) + 1);
        }

        System.out.println("Number Occurrences:");

        for (Map.Entry<Integer, Integer> entry : occurrenceMap.entrySet()) {

            System.out.println(entry.getKey() + " -> " + entry.getValue()
            );
        }
    }
}