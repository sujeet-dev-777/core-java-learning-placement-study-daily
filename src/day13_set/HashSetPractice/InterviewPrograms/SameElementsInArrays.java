package day13_set.HashSetPractice.InterviewPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class SameElementsInArrays {

    public static void main(String[] args) {

        Integer[] firstArray = {10, 20, 30};
        Integer[] secondArray = {30, 20, 10};

        HashSet<Integer> firstSet = new HashSet<>(Arrays.asList(firstArray));

        HashSet<Integer> secondSet = new HashSet<>(Arrays.asList(secondArray));

        if (firstSet.equals(secondSet)) {
            System.out.println("Both arrays contain the same elements.");
        } else {
            System.out.println("Arrays contain different elements.");
        }
    }
}