package day16_collections_utility;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchExample {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int index = Collections.binarySearch(numbers, 30);

        System.out.println("Index: " + index);
    }
}