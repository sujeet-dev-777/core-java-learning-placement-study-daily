package day13_utility_classes.ArraysPractice;

import java.util.Arrays;

public class SearchArray {

    public static void main(String[] args) {

        int[] numbers = {50, 20, 40, 10, 30};

        Arrays.sort(numbers);

        int searchValue = 30;

        int index = Arrays.binarySearch(numbers, searchValue);

        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println("Searching for: " + searchValue);
        System.out.println("Found at index: " + index);
    }
}