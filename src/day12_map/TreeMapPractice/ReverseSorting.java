package day12_map.TreeMapPractice;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class ReverseSorting {

    public static void main(String[] args) {

        TreeMap<Integer,String> studentRanks = new TreeMap<>(Collections.reverseOrder());

        studentRanks.put(5, "sujeet");
        studentRanks.put(2, "rohit");
        studentRanks.put(8, "dhoni");
        studentRanks.put(1, "virat");
        studentRanks.put(4, "rahul");

        System.out.println("Students in Descending Order:");

        for (Map.Entry<Integer, String> entry : studentRanks.entrySet()) {
            System.out.println("Rank : " + entry.getKey() + "  Student : " + entry.getValue());
        }
    }
}