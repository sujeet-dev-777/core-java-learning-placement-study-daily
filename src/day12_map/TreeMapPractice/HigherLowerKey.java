package day12_map.TreeMapPractice;

import java.util.TreeMap;

public class HigherLowerKey {

    public static void main(String[] args) {

        TreeMap<Integer, String> marks = new TreeMap<>();

        marks.put(10, "A");
        marks.put(20, "B");
        marks.put(30, "C");
        marks.put(40, "D");
        marks.put(50, "E");

        System.out.println("Higher key than 30 " + marks.higherKey(30));
        System.out.println("Lower key than 30 :" + marks.higherKey(30));

    }
}