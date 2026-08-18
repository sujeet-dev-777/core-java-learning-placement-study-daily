package day13_utility_classes.ArraysPractice;

import java.util.Arrays;

public class FillArray {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Before fill: " + Arrays.toString(numbers));

        Arrays.fill(numbers, 100);

        System.out.println("After fill: " + Arrays.toString(numbers));
    }
}