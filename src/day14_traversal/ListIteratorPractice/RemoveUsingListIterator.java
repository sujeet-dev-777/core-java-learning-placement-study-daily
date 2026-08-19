package day14_traversal.ListIteratorPractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class RemoveUsingListIterator {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(35);
        numbers.add(20);
        numbers.add(45);
        numbers.add(25);

        ListIterator<Integer> iterator = numbers.listIterator();

        while (iterator.hasNext()) {

            int number = iterator.next();

            if (number < 30) {
                iterator.remove();
            }
        }

        System.out.println("After removal: " + numbers);
    }
}