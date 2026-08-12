package day13_set.HashSetPractice.Medium;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorRemoveDemo {

    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {

            int number = iterator.next();

            if (number == 20) {
                iterator.remove();
            }
        }

        System.out.println("After removal: " + numbers);
    }
}