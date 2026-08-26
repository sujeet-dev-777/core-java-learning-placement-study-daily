package day16_collections_utility;

import java.util.Collections;
import java.util.List;

public class NCopiesExample {

    public static void main(String[] args) {

        List<String> values = Collections.nCopies(5, "Java");

        System.out.println(values);
    }
}