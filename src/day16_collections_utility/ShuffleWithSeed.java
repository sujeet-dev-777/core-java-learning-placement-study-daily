package day16_collections_utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ShuffleWithSeed {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Collections.shuffle(numbers, new Random(10));

        System.out.println(numbers);
    }
}