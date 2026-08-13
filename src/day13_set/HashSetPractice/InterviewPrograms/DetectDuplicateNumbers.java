package day13_set.HashSetPractice.InterviewPrograms;

import java.util.HashSet;

public class DetectDuplicateNumbers {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 20};

        HashSet<Integer> uniqueNumbers = new HashSet<>();

        boolean hasDuplicate = false;

        for (int number : numbers) {

            if (!uniqueNumbers.add(number)) {
                hasDuplicate = true;
                break;
            }
        }

        if (hasDuplicate) {
            System.out.println("Array contains duplicates.");
        } else {
            System.out.println("Array does not contain duplicates.");
        }
    }
}