package day14_traversal.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class FindElementIterator {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int searchValue = 30;
        boolean found = false;

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {

            int number = iterator.next();

            if (number == searchValue) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchValue + " found in the list.");
        } else {
            System.out.println(searchValue + " not found in the list.");
        }
    }
}