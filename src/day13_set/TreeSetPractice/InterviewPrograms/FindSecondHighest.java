package day13_set.TreeSetPractice.InterviewPrograms;

import java.util.TreeSet;

public class FindSecondHighest {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(80);
        numbers.add(80);
        numbers.add(40);
        numbers.add(70);


        Integer highest = numbers.last();
        Integer secondHighest = numbers.lower(highest);

//        Integer highest = numbers.pollLast();
//        Integer secondHighest = numbers.last();

        System.out.println("Numbers: " + numbers);
        System.out.println("Highest: " + highest);
        System.out.println("Second Highest: " + secondHighest);


    }
}