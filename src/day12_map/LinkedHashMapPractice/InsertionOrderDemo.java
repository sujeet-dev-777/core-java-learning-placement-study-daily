package day12_map.LinkedHashMapPractice;

import java.util.LinkedHashMap;

public class InsertionOrderDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        students.put(104, "Sujeet");
        students.put(101, "Virat");
        students.put(103, "rohit");
        students.put(102, "dhoni");

        System.out.println("LinkedHashMap");
        System.out.println(students);
    }
}