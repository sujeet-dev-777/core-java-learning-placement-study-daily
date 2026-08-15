package day13_set.TreeSetPractice.NavigableSetPractice;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigationMethodsDemo {

    public static void main(String[] args) {

        NavigableSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int target = 35;

        System.out.println("Numbers: " + numbers);
        System.out.println("Target: " + target);

        System.out.println("lower(): " + numbers.lower(target));

        System.out.println("floor(): " + numbers.floor(target));

        System.out.println("ceiling(): " + numbers.ceiling(target));

        System.out.println("higher(): " + numbers.higher(target));
    }
}