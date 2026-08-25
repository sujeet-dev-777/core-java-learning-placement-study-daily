package day16_collections_utility;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElements {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Amit");
        names.add("Rahul");
        names.add("Sujeet");
        names.add("Rohit");

        System.out.println("Before: " + names);

        Collections.swap(names, 0, 2);

        System.out.println("After: " + names);
    }
}