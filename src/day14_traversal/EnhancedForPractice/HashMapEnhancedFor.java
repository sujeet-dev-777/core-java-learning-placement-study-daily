package day14_traversal.EnhancedForPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapEnhancedFor {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Sujeet");
        students.put(102, "Rahul");
        students.put(103, "Amit");


        for (Map.Entry<Integer,String > entry : students.entrySet()){
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

    }
}