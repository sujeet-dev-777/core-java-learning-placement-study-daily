package day13_set.TreeSetPractice.NavigableSetPractice;

import java.util.NavigableSet;
import java.util.TreeSet;

public class PollFirstDemo {

    public static void main(String[] args) {

        NavigableSet<Integer> numbers = new TreeSet<>();

        numbers.add(30);
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Before Poll: " + numbers);

        Integer firstElement = numbers.pollFirst();

        System.out.println("Removed First Element: " + firstElement);

        System.out.println("After Poll: " + numbers);
    }
}