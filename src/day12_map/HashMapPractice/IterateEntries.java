package day12_map.HashMapPractice;

import java.util.HashMap;
import java.util.Map;

public class IterateEntries {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Sujeet");
        students.put(102, "Virat");
        students.put(103, "rohit");
        students.put(104, "dhoni");

        System.out.println("Student Details");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}