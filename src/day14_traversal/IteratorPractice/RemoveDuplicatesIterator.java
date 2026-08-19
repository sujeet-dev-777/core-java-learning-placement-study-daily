package day14_traversal.IteratorPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicatesIterator {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        Set<Integer> seenNumbers = new HashSet<>();

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {

            int number = iterator.next();

            if (!seenNumbers.add(number)) {
                iterator.remove();
            }
        }
        System.out.println("After removing duplicates: " + numbers);
    }
}