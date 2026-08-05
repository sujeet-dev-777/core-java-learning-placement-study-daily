package day12_map.TreeMapPractice;

import java.util.TreeMap;

public class StudentRank {

    public static void main(String[] args) {

        TreeMap<Integer, String> studentRanks = new TreeMap<>();

        studentRanks.put(101, "Rahul");
        studentRanks.put(104, "virat");
        studentRanks.put(102, "sujeet");
        studentRanks.put(103, "Rohit");

        int searchRank = 102;

        System.out.println(studentRanks);
        if (studentRanks.containsKey(searchRank)) {
            System.out.println("Student name : " + studentRanks.get(searchRank));
        } else {
            System.out.println("Rank Not Found");
        }
    }
}