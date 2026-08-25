package day16_collections_utility;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyExample {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Java");
        languages.add("C++");
        languages.add("Java");

        int count = Collections.frequency(languages, "Java");

        System.out.println("Java occurs: " + count);
    }
}