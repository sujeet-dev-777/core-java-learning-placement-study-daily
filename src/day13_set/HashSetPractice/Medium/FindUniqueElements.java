package day13_set.HashSetPractice.Medium;

import java.util.HashSet;

public class FindUniqueElements {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 40, 20, 50};

        HashSet<Integer> uniqueNumbers = new HashSet<>();
        HashSet<Integer> duplicateNumbers = new HashSet<>();

        for (int number : numbers) {

            if (!uniqueNumbers.add(number)) {
                duplicateNumbers.add(number);
            }
        }

        uniqueNumbers.removeAll(duplicateNumbers);

        System.out.println("Unique Elements: " + uniqueNumbers);
    }
}