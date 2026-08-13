package day13_set.HashSetPractice.InterviewPrograms;

import java.util.HashSet;

public class CommonElementsInArrays {

    public static void main(String[] args) {

        int[] firstArray = {10, 20, 30, 40};
        int[] secondArray = {30, 40, 50, 60};

        HashSet<Integer> firstSet = new HashSet<>();

        for (int number : firstArray) {
            firstSet.add(number);
        }

        HashSet<Integer> commonElements = new HashSet<>();

        for (int number : secondArray) {

            if (firstSet.contains(number)) {
                commonElements.add(number);
            }
        }

        System.out.println("Common Elements: " + commonElements);
    }
}