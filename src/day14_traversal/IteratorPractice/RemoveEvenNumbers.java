package day14_traversal.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveEvenNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        System.out.println("Before removal: " + numbers);

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {

            int number = iterator.next();

            if (number % 2 == 0) {
                iterator.remove();

            }
        }

        System.out.println("After removing even numbers: " + numbers);
    }
}