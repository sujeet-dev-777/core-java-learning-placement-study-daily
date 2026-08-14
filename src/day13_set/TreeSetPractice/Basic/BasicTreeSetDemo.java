package day13_set.TreeSetPractice.Basic;

import java.util.TreeSet;

public class BasicTreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Numbers: " + numbers);
    }
}