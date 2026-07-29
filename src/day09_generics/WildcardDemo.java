package day09_generics;

import java.util.Arrays;
import java.util.List;

public class WildcardDemo {

    public static void printList(List<?> list) {

        for (Object element : list) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30);

        List<String> names = Arrays.asList("Java", "Python", "C++");

        printList(numbers);

        printList(names);
    }
}