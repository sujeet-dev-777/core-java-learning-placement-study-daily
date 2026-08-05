package day12_map.TreeMapPractice;

import java.util.SortedMap;
import java.util.TreeMap;

public class HeadMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> studentMarks = new TreeMap<>();

        studentMarks.put(10, "A");
        studentMarks.put(50, "B");
        studentMarks.put(30, "C");
        studentMarks.put(40, "D");
        studentMarks.put(20, "E");

        System.out.println(studentMarks);
        SortedMap<Integer, String> HeadMap = studentMarks.headMap(40);
//        System.out.println(studentMarks.headMap(40));

        System.out.println("Elements Before Key 40:");
        System.out.println(HeadMap);
    }
}