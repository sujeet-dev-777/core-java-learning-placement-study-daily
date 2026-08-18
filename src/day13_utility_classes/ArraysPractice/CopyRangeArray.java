package day13_utility_classes.ArraysPractice;

import java.util.Arrays;

public class CopyRangeArray {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int[] copiedRange = Arrays.copyOfRange(numbers, 1, 4);

        System.out.println("Original array: " + Arrays.toString(numbers));

        System.out.println("Copied range: " + Arrays.toString(copiedRange));
    }
}