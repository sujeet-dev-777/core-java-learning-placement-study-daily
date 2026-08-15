package day13_set.TreeSetPractice.InterviewPrograms;

import java.util.TreeSet;

public class RemoveDuplicatesAndSort {

    public static void main(String[] args) {

        int[] numbers = {50, 20, 10, 50, 30, 20, 40, 10};

        TreeSet<Integer> uniqueSortedNumbers = new TreeSet<>();

        for (int number : numbers) {
            uniqueSortedNumbers.add(number);
        }

        System.out.println("Unique Sorted Numbers: " + uniqueSortedNumbers);
    }
}