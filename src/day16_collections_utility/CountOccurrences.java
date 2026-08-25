package day16_collections_utility;

import java.util.ArrayList;
import java.util.Collections;

public class CountOccurrences {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);

        int tenCount = Collections.frequency(numbers, 10);

        int twentyCount = Collections.frequency(numbers, 20);

        System.out.println("10 occurs: " + tenCount);
        System.out.println("20 occurs: " + twentyCount);
    }
}