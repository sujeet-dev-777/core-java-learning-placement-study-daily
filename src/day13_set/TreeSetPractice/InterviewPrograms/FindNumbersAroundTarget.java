package day13_set.TreeSetPractice.InterviewPrograms;

import java.util.TreeSet;

public class FindNumbersAroundTarget {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        int target = 35;

        System.out.println("Numbers: " + numbers);
        System.out.println("Target: " + target);

        System.out.println("Lower: " + numbers.lower(target));

        System.out.println("Floor: " + numbers.floor(target));

        System.out.println("Ceiling: " + numbers.ceiling(target));

        System.out.println("Higher: " + numbers.higher(target));
    }
}