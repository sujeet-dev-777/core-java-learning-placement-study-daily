package day13_set.TreeSetPractice.NavigableSetPractice;

import java.util.NavigableSet;
import java.util.TreeSet;

public class BasicNavigableSetDemo {

    public static void main(String[] args) {

        NavigableSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Numbers: " + numbers);

        System.out.println("Lower than 30: " + numbers.lower(30));
        System.out.println("Floor of 30: " + numbers.floor(30));
        System.out.println("Ceiling of 30: " + numbers.ceiling(30));
        System.out.println("Higher than 30: " + numbers.higher(30));
    }
}