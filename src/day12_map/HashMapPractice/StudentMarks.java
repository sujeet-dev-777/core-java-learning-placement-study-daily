package day12_map.HashMapPractice;

import java.util.HashMap;
import java.util.Map;

public class StudentMarks {

    public static void main(String[] args) {

        HashMap<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("Sujeet", 85);
        studentMarks.put("Rohit", 90);
        studentMarks.put("Virat", 95);
        studentMarks.put("Hardik", 88);

        System.out.println("Student Marks:");

        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Marks of Hardik : " + studentMarks.get("Hardik"));
    }
}