package day13_set.LinkedHashSetPractice.InterviewPrograms;

import java.util.LinkedHashSet;

public class FirstOccurrenceOfEachElement {

    public static void main(String[] args) {

        int[] numbers = {5, 3, 5, 2, 3, 1, 2, 4};

        LinkedHashSet<Integer> firstOccurrences = new LinkedHashSet<>();

        for (int number : numbers) {
            firstOccurrences.add(number);
        }

        System.out.println("First Occurrence Order: " + firstOccurrences);
    }
}