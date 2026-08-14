package day13_set.TreeSetPractice.Medium;

import java.util.TreeSet;

public class FirstAndLastElement {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(80);
        numbers.add(10);
        numbers.add(40);
        numbers.add(70);

        System.out.println("Numbers: " + numbers);

        System.out.println("Lowest Number: " + numbers.first());
        System.out.println("Highest Number: " + numbers.last());
    }
}