package day13_utility_classes.ArraysPractice;

import java.util.Arrays;

public class PrintArray {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array: " + Arrays.toString(numbers)); // 1D Array

        int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        System.out.println(Arrays.deepToString(matrix));   // 2D Array
    }
}