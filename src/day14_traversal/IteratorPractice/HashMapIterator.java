package day14_traversal.IteratorPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterator {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Sujeet");
        students.put(102, "Rahul");
        students.put(103, "Amit");
        students.put(104, "Rohit");

        Iterator<Map.Entry<Integer, String>> iterator = students.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<Integer, String> entry = iterator.next();

            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}