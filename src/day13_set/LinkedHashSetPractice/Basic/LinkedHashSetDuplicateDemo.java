package day13_set.LinkedHashSetPractice.Basic;

import java.util.LinkedHashSet;

public class LinkedHashSetDuplicateDemo {

    public static void main(String[] args) {

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        System.out.println("Add 10: " + numbers.add(10));
        System.out.println("Add 20: " + numbers.add(20));
        System.out.println("Add 10 again: " + numbers.add(10));
        System.out.println("Add 30: " + numbers.add(30));
        System.out.println("Add 20 again: " + numbers.add(20));

        System.out.println("Numbers: " + numbers);
    }
}