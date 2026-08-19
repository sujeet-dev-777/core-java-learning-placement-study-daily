package day14_traversal.ListIteratorPractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class AddUsingListIterator {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Before Updated list: " + numbers);

        ListIterator<Integer> iterator = numbers.listIterator();

        while (iterator.hasNext()) {

            int number = iterator.next();

            if (number == 20) {
                iterator.add(25);
            }
        }

        System.out.println("After Updated list: " + numbers);
    }
}