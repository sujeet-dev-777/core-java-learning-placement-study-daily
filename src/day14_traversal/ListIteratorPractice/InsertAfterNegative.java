package day14_traversal.ListIteratorPractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class InsertAfterNegative {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(-20);
        numbers.add(30);
        numbers.add(-40);

        ListIterator<Integer> iterator = numbers.listIterator();

        while (iterator.hasNext()) {

            int number = iterator.next();

            if (number < 0) {
                iterator.add(0);
            }
        }

        System.out.println("Updated list: " + numbers);
    }
}