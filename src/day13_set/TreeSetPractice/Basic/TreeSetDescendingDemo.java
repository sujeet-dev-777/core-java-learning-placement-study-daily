package day13_set.TreeSetPractice.Basic;

import java.util.TreeSet;

public class TreeSetDescendingDemo {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(50);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Ascending Order: " + numbers);

        System.out.println("Descending Order: " + numbers.descendingSet());
    }
}