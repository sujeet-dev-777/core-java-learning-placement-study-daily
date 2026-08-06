package day12_map.HashtablePractice;

import java.util.Hashtable;

public class EqualsDemo {

    public static void main(String[] args) {

        Hashtable<Integer, String> map1 = new Hashtable<>();
        Hashtable<Integer, String> map2 = new Hashtable<>();

        // Adding same key-value pairs
        map1.put(1, "Apple");
        map1.put(2, "Banana");
        map1.put(3, "Mango");

        map2.put(1, "Apple");
        map2.put(2, "Banana");
        map2.put(3, "Mango");

        // Compare both maps
        System.out.println("Map1 : " + map1);
        System.out.println("Map2 : " + map2);

        System.out.println("Are both maps equal? : " + map1.equals(map2));

        // Change one value
        map2.put(3, "Orange");

        System.out.println("After changing one value:");

        System.out.println("Map1 : " + map1);
        System.out.println("Map2 : " + map2);

        System.out.println("Are both maps equal? : " + map1.equals(map2));
    }
}