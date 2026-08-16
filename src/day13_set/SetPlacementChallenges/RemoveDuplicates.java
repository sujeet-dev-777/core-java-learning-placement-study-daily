package day13_set.SetPlacementChallenges;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 20, 40, 30};

        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        System.out.println("Original Array:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        System.out.println("Unique Numbers: " + uniqueNumbers);
    }
}