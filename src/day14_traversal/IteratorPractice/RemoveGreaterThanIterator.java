package day14_traversal.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveGreaterThanIterator {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(25);
        numbers.add(75);
        numbers.add(40);
        numbers.add(90);
        numbers.add(60);
        numbers.add(30);

        System.out.println("Before removal: " + numbers);

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {

            int number = iterator.next();

            if (number > 50) {
                iterator.remove();
            }
        }

        System.out.println("After removal: " + numbers);
    }
}