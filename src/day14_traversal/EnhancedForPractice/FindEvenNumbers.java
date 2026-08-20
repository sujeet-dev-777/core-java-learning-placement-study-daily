package day14_traversal.EnhancedForPractice;

import java.util.ArrayList;

public class FindEvenNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        System.out.println("Even numbers:");

        for (int number : numbers) {

            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}