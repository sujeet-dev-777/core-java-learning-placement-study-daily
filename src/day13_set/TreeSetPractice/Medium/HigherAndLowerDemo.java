package day13_set.TreeSetPractice.Medium;

import java.util.TreeSet;

public class HigherAndLowerDemo {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        int target = 30;

        System.out.println("Numbers: " + numbers);
        System.out.println("Target: " + target);

        System.out.println("Higher: " + numbers.higher(target));
        System.out.println("Lower: " + numbers.lower(target));
    }
}