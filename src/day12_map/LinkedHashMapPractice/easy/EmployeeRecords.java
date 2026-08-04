package day12_map.LinkedHashMapPractice.easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class EmployeeRecords {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> Students = new LinkedHashMap<>();

        Students.put(101, "Rahul");
        Students.put(102, "Amit");
        Students.put(103, "Priya");
        Students.put(104, "Neha");
        Students.put(105, "Karan");

        System.out.println(Students);

        for(Map.Entry<Integer,String> entry : Students.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
