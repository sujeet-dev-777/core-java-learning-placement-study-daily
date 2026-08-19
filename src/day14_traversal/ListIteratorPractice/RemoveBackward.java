package day14_traversal.ListIteratorPractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class RemoveBackward {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(30);

        ListIterator<Integer> iterator = numbers.listIterator();

        // Move cursor to the end
        while (iterator.hasNext()) {
            iterator.next();
        }

        // Traverse backward
        while (iterator.hasPrevious()) {

            int number = iterator.previous();

            if (number > 30) {
                iterator.remove();
            }
        }

        System.out.println("After removal: " + numbers);
    }
}