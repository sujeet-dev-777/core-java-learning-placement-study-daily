package day16_collections_utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CopyList {

    public static void main(String[] args) {

        ArrayList<String> source = new ArrayList<>(Arrays.asList("Java", "Python", "Selenium"));

        ArrayList<String> destination = new ArrayList<>(Arrays.asList("", "", ""));

        Collections.copy(destination, source);

        System.out.println(destination);
    }
}