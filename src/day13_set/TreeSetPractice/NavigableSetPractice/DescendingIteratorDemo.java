package day13_set.TreeSetPractice.NavigableSetPractice;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class DescendingIteratorDemo {

    public static void main(String[] args) {

        NavigableSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Descending Order:");

        Iterator<Integer> iterator = numbers.descendingIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}