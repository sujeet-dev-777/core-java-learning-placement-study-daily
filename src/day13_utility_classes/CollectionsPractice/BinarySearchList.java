package day13_utility_classes.CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int searchValue = 30;

        int index = Collections.binarySearch(numbers, searchValue);

        System.out.println("Numbers: " + numbers);
        System.out.println("Searching for: " + searchValue);
        System.out.println("Found at index: " + index);
    }
}