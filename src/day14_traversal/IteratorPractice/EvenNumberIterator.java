package day14_traversal.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenNumberIterator {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {

            int number = iterator.next();

            if (number % 2 == 0) {
                System.out.println(number);
            }

        }

    }
}