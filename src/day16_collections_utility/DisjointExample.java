package day16_collections_utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DisjointExample {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30));

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(40, 50, 60));

        boolean result = Collections.disjoint(list1, list2);

        System.out.println(result);
    }
}