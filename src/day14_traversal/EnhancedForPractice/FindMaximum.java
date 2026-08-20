package day14_traversal.EnhancedForPractice;

import java.util.ArrayList;

public class FindMaximum {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(45);
        numbers.add(78);
        numbers.add(23);
        numbers.add(91);
        numbers.add(56);

        int maximum = numbers.get(0);

        for (int number : numbers){

            if (number > maximum){
                maximum = number;
            }
        }

        System.out.println("Maximum: " + maximum);
    }
}