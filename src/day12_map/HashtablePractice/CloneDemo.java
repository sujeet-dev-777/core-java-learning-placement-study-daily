package day12_map.HashtablePractice;

import java.util.Hashtable;

public class CloneDemo {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        Hashtable<Integer, String> originalMap = new Hashtable<>();

        originalMap.put(101, "Rahul");
        originalMap.put(102, "Neha");

        Hashtable<Integer, String> copiedMap = (Hashtable<Integer, String>) originalMap.clone();

        copiedMap.put(103, "Aman");

        System.out.println("Original Map : " + originalMap);

        System.out.println("Copied Map   : " + copiedMap);
    }
}