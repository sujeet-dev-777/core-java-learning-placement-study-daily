package day12_map.HashMapPractice;

import java.util.HashMap;

public class ClearMap {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Sujeet");
        students.put(102, "Virat");
        students.put(103, "rohit");
        students.put(104, "dhoni");

        System.out.println("Before Clear");
        System.out.println(students);

        students.clear();

        System.out.println("After Clear");
        System.out.println(students);

        System.out.println("Is Empty : " + students.isEmpty());
    }
}