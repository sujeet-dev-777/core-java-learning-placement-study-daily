package day12_map.HashMapPractice;

import java.util.HashMap;

public class CheckEmpty {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        System.out.println("Is Empty : " + students.isEmpty());

        students.put(101, "sujeet");

        System.out.println("Is Empty : " + students.isEmpty());
    }
}