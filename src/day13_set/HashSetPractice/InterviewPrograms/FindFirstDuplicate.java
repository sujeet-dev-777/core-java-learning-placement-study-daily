package day13_set.HashSetPractice.InterviewPrograms;

import java.util.HashSet;

public class FindFirstDuplicate {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 20, 50, 30};

        HashSet<Integer> seenNumbers = new HashSet<>();

        for (int number : numbers) {

            if (!seenNumbers.add(number)) {
                System.out.println("First Duplicate: " + number);
                break;
            }
        }
    }
}