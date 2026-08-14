package day13_set.TreeSetPractice.Basic;

import java.util.TreeSet;

public class TreeSetMethodsDemo {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Numbers: " + numbers);

        System.out.println("First Element: " + numbers.first());

        System.out.println("Last Element: " + numbers.last());

        System.out.println("Contains 30: " + numbers.contains(30));

        System.out.println("Size: " + numbers.size());

        numbers.remove(20);

        System.out.println("After removing 20: " + numbers);

        System.out.println("Is Empty: " + numbers.isEmpty());
        numbers.clear();
        System.out.println("After removing all");
        System.out.println("Is Empty: " + numbers.isEmpty());

    }
}