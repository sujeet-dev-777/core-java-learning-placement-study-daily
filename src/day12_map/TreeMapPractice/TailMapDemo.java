package day12_map.TreeMapPractice;

import java.util.SortedMap;
import java.util.TreeMap;

public class TailMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> studentMarks = new TreeMap<>();

        studentMarks.put(60, "A");
        studentMarks.put(10, "B");
        studentMarks.put(20, "C");
        studentMarks.put(30, "0");
        studentMarks.put(40, "D");
        studentMarks.put(50, "E");

        SortedMap<Integer, String> tailMap = studentMarks.tailMap(30);

        System.out.println("Elements From Key 30:");
        System.out.println(tailMap);
    }
}