package day12_map.LinkedHashMapPractice.medium;

import java.util.LinkedHashMap;
import java.util.Map;

public class InsertionOrderDemo {

    public static void main(String[] args) {

        Map<Integer, String> students = new LinkedHashMap<>();

        students.put(107, "Rahul");
        students.put(108, "Amit");
        students.put(103, "Priya");
        students.put(104, "Neha");
        students.put(105, "Karan");
        students.put(106, "Sujeet");
        students.put(101, "Virat");
        students.put(102, "Rohit");
        students.put(109, "Dhoni");

        for(Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}