package day13_set.SetPlacementChallenges;

import java.util.HashSet;
import java.util.Set;

public class FindUniqueElements {

    public static void main(String[] args) {

        int[] firstArray = {10, 20, 30, 40, 50};

        int[] secondArray = {30, 40, 50, 60, 70};

        Set<Integer> secondSet = new HashSet<>();

        for (int number : secondArray) {
            secondSet.add(number);
        }

        Set<Integer> uniqueElements = new HashSet<>();

        for (int number : firstArray) {

            if (!secondSet.contains(number)) {
                uniqueElements.add(number);
            }
        }

        System.out.println("Elements Only in First Array: " + uniqueElements);
    }
}