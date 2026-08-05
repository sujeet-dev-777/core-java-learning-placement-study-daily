package day12_map.TreeMapPractice;

import java.util.Map;
import java.util.TreeMap;

public class PollFirstLastDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> cities = new TreeMap<>();

        cities.put(1, "Mumbai");
        cities.put(2, "Delhi");
        cities.put(3, "Pune");
        cities.put(4, "Chennai");
        cities.put(5, "Hyderabad");

        System.out.println(cities);

        Map.Entry<Integer, String> firstEntry = cities.pollFirstEntry();
        Map.Entry<Integer, String> lastEntry = cities.pollLastEntry();

        System.out.println("Removed First Entry : " + firstEntry);
        System.out.println("Removed Last Entry  : " + lastEntry);

        System.out.println();

        System.out.println("Remaining Map:");
        System.out.println(cities);
    }
}