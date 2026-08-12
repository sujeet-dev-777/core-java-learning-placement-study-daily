package day13_set.HashSetPractice.Medium;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(30);

        System.out.println("Original List: " + numbers);

//        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);

        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.println("After Removing Duplicates: " + uniqueNumbers);
    }
}