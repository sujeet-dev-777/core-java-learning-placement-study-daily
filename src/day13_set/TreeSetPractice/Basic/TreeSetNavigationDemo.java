package day13_set.TreeSetPractice.Basic;

import java.util.TreeSet;

public class TreeSetNavigationDemo {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Numbers: " + numbers);

        System.out.println("Higher than 30: " + numbers.higher(30));

        System.out.println("Lower than 30: " + numbers.lower(30));

        System.out.println("Ceiling of 30: " + numbers.ceiling(30));

        System.out.println("Floor of 30: " + numbers.floor(30));
    }
}