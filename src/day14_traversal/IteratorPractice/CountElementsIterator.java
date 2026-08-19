package day14_traversal.IteratorPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CountElementsIterator {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(25);
        numbers.add(75);
        numbers.add(40);
        numbers.add(90);
        numbers.add(60);
        numbers.add(30);

        int count = 0;

        System.out.println("All Numbers : " + numbers);

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {

            int number = iterator.next();

            if (number > 50) {
                count++;
            }
        }

        System.out.println("Numbers greater than 50: " + count);
    }
}