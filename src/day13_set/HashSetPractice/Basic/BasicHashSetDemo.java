package day13_set.HashSetPractice.Basic;

import java.util.HashSet;

public class BasicHashSetDemo {

    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(50);

        System.out.println("Numbers: " + numbers);
        System.out.println("Total unique numbers: " + numbers.size());
    }
}