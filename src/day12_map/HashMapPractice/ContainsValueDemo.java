package day12_map.HashMapPractice;

import java.util.HashMap;

public class ContainsValueDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Sujeet");
        students.put(102, "Virat");
        students.put(103, "rohit");
        students.put(104, "dhoni");

        System.out.println("Contains rohit : "
                + students.containsValue("rohit"));

        System.out.println("Contains bumrah : "
                + students.containsValue("bumrah"));
    }
}