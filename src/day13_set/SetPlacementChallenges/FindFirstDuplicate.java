package day13_set.SetPlacementChallenges;

import java.util.HashSet;
import java.util.Set;

public class FindFirstDuplicate {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 20, 50, 30};

        Set<Integer> seenNumbers = new HashSet<>();

        int firstDuplicate = -1;

        for (int number : numbers) {

            if (seenNumbers.contains(number)) {

                firstDuplicate = number;
                break;
            }

            seenNumbers.add(number);
        }

        if (firstDuplicate != -1) {

            System.out.println("First Duplicate: " + firstDuplicate);

        } else {

            System.out.println("No Duplicate Found");
        }
    }
}