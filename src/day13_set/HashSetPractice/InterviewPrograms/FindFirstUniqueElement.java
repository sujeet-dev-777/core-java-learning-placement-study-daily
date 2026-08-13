package day13_set.HashSetPractice.InterviewPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstUniqueElement {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 20, 40};

        Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();

        for (int number : numbers) {

            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {

            if (entry.getValue() == 1) {

                System.out.println(
                        "First Unique Element: " + entry.getKey()
                );

                break;
            }
        }
    }
}