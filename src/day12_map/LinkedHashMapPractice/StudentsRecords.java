package day12_map.LinkedHashMapPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class StudentsRecords {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        students.put(101, "Sujeet");
        students.put(102, "Virat");
        students.put(103, "rohit");
        students.put(104, "dhoni");

        System.out.println("Student Records");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}