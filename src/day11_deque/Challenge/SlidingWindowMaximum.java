package day11_deque.Challenge;

import java.util.Arrays;

public class SlidingWindowMaximum {

    public static void main(String[] args) {

        int[] numbers = {1, 3, -1, -3, 5, 3, 6, 7};

        int k = 3;

        System.out.println("Maximum of each window:");

        for (int i = 0; i <= numbers.length - k; i++) {


            int max = numbers[i];

            for (int j = i; j < i + k; j++) {

                if (numbers[j] > max) {
                    max = numbers[j];
                }
            }

            System.out.println("current max : "+max);
        }
    }
}