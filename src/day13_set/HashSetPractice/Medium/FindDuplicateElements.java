package day13_set.HashSetPractice.Medium;

import java.util.HashSet;

public class FindDuplicateElements {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 10, 40, 20, 50, 30};

        HashSet<Integer> seenNumbers = new HashSet<>();
        HashSet<Integer> duplicateNumbers = new HashSet<>();

        for (int number : numbers) {

            if (!seenNumbers.add(number)) {
                duplicateNumbers.add(number);
            }
        }

        System.out.println("Duplicate Elements: " + duplicateNumbers);
    }
}