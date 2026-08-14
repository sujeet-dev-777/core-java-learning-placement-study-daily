package day13_set.TreeSetPractice.Basic;

import java.util.TreeSet;

public class TreeSetDuplicateDemo {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        System.out.println("Add 30: " + numbers.add(30));
        System.out.println("Add 10: " + numbers.add(10));
        System.out.println("Add 20: " + numbers.add(20));
        System.out.println("Add 30 again: " + numbers.add(30));
        System.out.println("Add 10 again: " + numbers.add(10));

        System.out.println("Numbers: " + numbers);
    }
}