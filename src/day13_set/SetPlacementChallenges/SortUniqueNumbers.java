package day13_set.SetPlacementChallenges;

import java.util.Set;
import java.util.TreeSet;

public class SortUniqueNumbers {

    public static void main(String[] args) {

        int[] numbers = {50, 20, 10, 40, 20, 30, 50};

        Set<Integer> sortedNumbers = new TreeSet<>();

        for (int number : numbers) {
            sortedNumbers.add(number);
        }

        System.out.println("Sorted Unique Numbers: " + sortedNumbers);
    }
}