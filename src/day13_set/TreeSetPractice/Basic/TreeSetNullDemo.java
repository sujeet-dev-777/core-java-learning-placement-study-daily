package day13_set.TreeSetPractice.Basic;

import java.util.TreeSet;

public class TreeSetNullDemo {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);

        try {
            numbers.add(null);
        } catch (NullPointerException exception) {
            System.out.println("TreeSet does not support null elements.");
        }

        System.out.println("Numbers: " + numbers);
    }
}