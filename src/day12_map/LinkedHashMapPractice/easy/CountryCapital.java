package day12_map.LinkedHashMapPractice.easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountryCapital {


    public static void main(String[] args) {

        LinkedHashMap<String, String> Students = new LinkedHashMap<>();

        Students.put("India", "Delhi");
        Students.put("USA", "Washington");
        Students.put("Japan", "Tokyo");
        Students.put("France", "Paris");
        Students.put("Australia", "Canberra");


        System.out.println(Students);

        for(Map.Entry<String,String> entry : Students.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
