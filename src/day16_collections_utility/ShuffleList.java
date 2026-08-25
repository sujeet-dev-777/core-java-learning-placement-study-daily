package day16_collections_utility;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleList {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Sujeet");
        names.add("Rahul");
        names.add("Amit");
        names.add("Rohit");
        names.add("Karan");

        System.out.println("Before shuffle: " + names);

        Collections.shuffle(names);

        System.out.println("After shuffle: " + names);
    }
}