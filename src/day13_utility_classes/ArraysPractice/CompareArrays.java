package day13_utility_classes.ArraysPractice;

import java.util.Arrays;

public class CompareArrays {

    public static void main(String[] args) {

        int[] firstArray = {10, 20, 30};
        int[] secondArray = {10, 20, 30};
        int[] thirdArray = {30, 20, 10};

        System.out.println("First and second equal: " + Arrays.equals(firstArray, secondArray));

        System.out.println("First and third equal: " + Arrays.equals(firstArray, thirdArray));
    }
}