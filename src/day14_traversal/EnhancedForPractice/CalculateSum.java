package day14_traversal.EnhancedForPractice;

import java.util.ArrayList;

public class CalculateSum {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int sum = 0;

        for (int number : numbers) {

            sum = sum + number;
        }

        System.out.println("Sum: " + sum);
    }
}