package day13_set.TreeSetPractice.InterviewPrograms;

import java.util.TreeSet;

public class CombinedInterviewProblem {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);

        int target = 55;

        System.out.println("Numbers: " + numbers);

        System.out.println("Minimum: " + numbers.first());

        System.out.println("Maximum: " + numbers.last());

        System.out.println("Lower than target: " + numbers.lower(target));

        System.out.println("Higher than target: " + numbers.higher(target));

        System.out.println("Floor of target: " + numbers.floor(target));

        System.out.println("Ceiling of target: " + numbers.ceiling(target));

        System.out.println("Below target: " + numbers.headSet(target));

        System.out.println("From target onward: " + numbers.tailSet(target));

        System.out.println("Range 20 to 80: " + numbers.subSet(20, 80));

        System.out.println("Descending: " + numbers.descendingSet());
    }
}