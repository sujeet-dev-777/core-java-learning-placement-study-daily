package day13_set.TreeSetPractice.NavigableSetPractice;

import java.util.NavigableSet;
import java.util.TreeSet;

public class PollLastDemo {

    public static void main(String[] args) {

        NavigableSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Before Poll: " + numbers);

        Integer lastElement = numbers.pollLast();

        System.out.println("Removed Last Element: " + lastElement);

        System.out.println("After Poll: " + numbers);
    }
}