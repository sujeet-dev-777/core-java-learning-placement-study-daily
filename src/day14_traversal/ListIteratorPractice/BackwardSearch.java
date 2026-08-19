package day14_traversal.ListIteratorPractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class BackwardSearch {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int searchValue = 30;
        boolean found = false;

        ListIterator<Integer> iterator = numbers.listIterator();

        // Move to the end
        while (iterator.hasNext()) {
            iterator.next();
        }

        // Search backward
        while (iterator.hasPrevious()) {

            int number = iterator.previous();

            if (number == searchValue) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchValue + " found.");
        } else {
            System.out.println(searchValue + " not found.");
        }
    }
}