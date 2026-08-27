package day16_collections_utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class FrequecyCount {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10,30,10,40,50, 20, 10, 30, 20, 40));

        LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);
        System.out.println("All numbers"+numbers);

        for (Integer number : uniqueNumbers) {

            int count = Collections.frequency(numbers, number);

            System.out.println(number + " -> " + count);


        }
    }

}
