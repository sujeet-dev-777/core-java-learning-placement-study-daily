package day13_set.HashSetPractice.Medium;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayToHashSet {

    public static void main(String[] args) {

        Integer[] numbers = {10, 20, 30, 20, 40, 10, 50};


        HashSet<Integer> numberSet = new HashSet<>(Arrays.asList(numbers));

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("HashSet: " + numberSet);
    }
}