package day13_utility_classes.ArraysPractice;

import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) {

        int[] originalArray = {10, 20, 30, 40, 50};

        int[] copiedArray = Arrays.copyOf(originalArray,3);

//        int val = originalArray.length;
//        int[] copiedArray = Arrays.copyOf(originalArray,val);

        System.out.println("Original array: " + Arrays.toString(originalArray));

        System.out.println("Copied array: " + Arrays.toString(copiedArray));
    }
}