package day14_traversal.ListIteratorPractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class UpdateBackward {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(-20);
        numbers.add(30);
        numbers.add(-40);
        numbers.add(50);

        ListIterator<Integer> iterator = numbers.listIterator();

        // Move to the end
        while (iterator.hasNext()) {
            iterator.next();
        }

        // Traverse backward
        while (iterator.hasPrevious()) {

            int number = iterator.previous();

            if (number < 0) {
                iterator.set(0);
            }
        }

        System.out.println("Updated list: " + numbers);
    }
}