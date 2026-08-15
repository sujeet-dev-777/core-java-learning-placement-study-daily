package day13_set.TreeSetPractice.NavigableSetPractice;

import java.util.NavigableSet;
import java.util.TreeSet;

public class RangeViewDemo {

    public static void main(String[] args) {

        NavigableSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);

        System.out.println("Original Set: " + numbers);

        NavigableSet<Integer> range = numbers.subSet(20, true, 60, false);

        System.out.println("Range: " + range);
    }
}