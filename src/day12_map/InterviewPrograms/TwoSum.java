package day12_map.InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] numbers = {2, 11, 11,7, 15};

        int target = 9;

        Map<Integer, Integer> numberIndexMap = new HashMap<>();

        for (int index = 0; index < numbers.length; index++) {

            int currentNumber = numbers[index];

            int requiredNumber = target - currentNumber;

            if (numberIndexMap.containsKey(requiredNumber)) {

                System.out.println("Pair Found: " + requiredNumber + " + " + currentNumber + " = " + target);

                System.out.println("Indexes: " + numberIndexMap.get(requiredNumber) + ", " + index);

                return;
            }

            numberIndexMap.put(currentNumber, index);
        }

        System.out.println("No Pair Found");
    }
}