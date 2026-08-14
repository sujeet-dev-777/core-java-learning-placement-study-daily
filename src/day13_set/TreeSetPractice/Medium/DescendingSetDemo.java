package day13_set.TreeSetPractice.Medium;

import java.util.TreeSet;

public class DescendingSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Ascending: " + numbers);

        System.out.println("Descending: " + numbers.descendingSet());
    }
}