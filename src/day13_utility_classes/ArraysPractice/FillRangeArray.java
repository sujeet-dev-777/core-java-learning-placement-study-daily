package day13_utility_classes.ArraysPractice;

import java.util.Arrays;

public class FillRangeArray {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        Arrays.fill(numbers, 1, 4, 0);

        System.out.println(Arrays.toString(numbers));
    }
}