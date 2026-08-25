package day16_collections_utility;

import java.util.ArrayList;
import java.util.Collections;

public class MinMax {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(45);
        numbers.add(90);
        numbers.add(12);
        numbers.add(67);
        numbers.add(34);

        int minimum = Collections.min(numbers);
        int maximum = Collections.max(numbers);

        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
    }
}