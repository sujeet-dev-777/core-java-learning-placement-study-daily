package day13_set.SetPlacementChallenges;

import java.util.LinkedHashSet;
import java.util.Set;

public class PreserveInsertionOrder {

    public static void main(String[] args) {

        int[] numbers = {50, 20, 50, 10, 30, 20, 40};

        Set<Integer> uniqueNumbers = new LinkedHashSet<>();

        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        System.out.println("Unique Numbers: " + uniqueNumbers);
    }
}