package day12_map.TreeMapPractice;

import java.util.TreeMap;

public class CeilingFloorKey {

    public static void main(String[] args) {

        TreeMap<Integer, String> productMap = new TreeMap<>();

        productMap.put(100, "Keyboard");
        productMap.put(200, "Mouse");
        productMap.put(300, "Monitor");
        productMap.put(400, "Printer");

        System.out.println("Ceiling Key of 250 : " + productMap.ceilingKey(250));
        System.out.println("Floor Key of 250   : " + productMap.floorKey(250));
    }
}