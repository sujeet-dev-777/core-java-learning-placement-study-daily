package day14_traversal.ListIteratorPractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class StartFromIndex {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        ListIterator<Integer> iterator = numbers.listIterator(2);

        System.out.println("Forward from index 2:");

        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }
    }
}