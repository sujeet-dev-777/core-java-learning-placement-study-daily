package day13_set.TreeSetPractice.Medium;

import java.util.TreeSet;

public class SubSetInclusiveDemo {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);

        System.out.println("Inclusive Range: " + numbers.subSet(20, true, 60, true));
    }
}