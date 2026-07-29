package day09_generics;

import java.util.Arrays;
import java.util.List;

public class UpperBoundDemo {

    public static double sum(List<? extends Number> list) {

        double total = 0;

        for (Number number : list) {

            total += number.doubleValue();
        }

        return total;
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10,20,30);

        List<Double> decimal = Arrays.asList(10.5,20.5,30.5);

        System.out.println(sum(numbers));

        System.out.println(sum(decimal));
    }
}