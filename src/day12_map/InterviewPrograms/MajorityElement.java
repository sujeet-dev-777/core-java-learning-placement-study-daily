package day12_map.InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {

        int[] numbers = {2, 2, 1, 1, 1, 2, 2};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number : numbers) {

            frequencyMap.put(
                    number,
                    frequencyMap.getOrDefault(number, 0) + 1
            );
        }

        int majorityElement = -1;

        for (Map.Entry<Integer, Integer> entry
                : frequencyMap.entrySet()) {

            if (entry.getValue() > numbers.length / 2) {

                majorityElement = entry.getKey();

                break;
            }
        }

        System.out.println("Majority Element: "
                + majorityElement);
    }
}