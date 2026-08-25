package day16_collections_utility;

import java.util.ArrayList;
import java.util.Collections;

public class FillList {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Amit");
        names.add("Rahul");
        names.add("Sujeet");
        names.add("Rohit");

        Collections.fill(names, "Java");

        System.out.println(names);
    }
}