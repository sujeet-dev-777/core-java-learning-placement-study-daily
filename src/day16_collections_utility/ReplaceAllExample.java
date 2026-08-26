package day16_collections_utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReplaceAllExample {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Java", "Python", "Java", "C++", "Java"));

        Collections.replaceAll(names, "Java", "Selenium");

        System.out.println(names);
    }
}