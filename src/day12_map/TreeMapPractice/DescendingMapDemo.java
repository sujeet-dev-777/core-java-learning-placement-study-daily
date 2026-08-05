package day12_map.TreeMapPractice;

import java.util.NavigableMap;
import java.util.TreeMap;

public class DescendingMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> products = new TreeMap<>();

        products.put(100, "Keyboard");
        products.put(300, "Monitor");
        products.put(200, "Mouse");
        products.put(500, "Printer");
        products.put(400, "Speaker");


        NavigableMap<Integer,String> descendingMap = products.descendingMap();


        System.out.println("Original Map:");
        System.out.println(products);

        System.out.println();

        System.out.println("Descending Map:");
        System.out.println(descendingMap);
    }
}