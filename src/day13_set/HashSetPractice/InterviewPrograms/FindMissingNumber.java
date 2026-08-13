package day13_set.HashSetPractice.InterviewPrograms;

import java.util.HashSet;

public class FindMissingNumber {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 5, 6};

        HashSet<Integer> numberSet = new HashSet<>();

        for (int number : numbers) {
            numberSet.add(number);
        }

        int missingNumber = 0;

        for (int number = 1; number <= 6; number++) {

            if (!numberSet.contains(number)) {
                missingNumber = number;
                break;
            }
        }

        System.out.println("Missing Number: " + missingNumber);
    }
}