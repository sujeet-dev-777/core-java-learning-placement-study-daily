package day12_map.HashMapPractice;

import java.util.HashMap;

public class ContainsKeyDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Sujeet");
        students.put(102, "Virat");
        students.put(103, "rohit");
        students.put(104, "dhoni");

        System.out.println("Contains Key 102 : "
                + students.containsKey(102));

        System.out.println("Contains Key 105 : "
                + students.containsKey(105));
    }
}