package day12_map.AdvancedMaps;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

    public static void main(String[] args) {

        IdentityHashMap<String, Integer> identityMap = new IdentityHashMap<>();

        String language1 = new String("Java");
        String language2 = new String("Java");

        identityMap.put(language1, 100);
        identityMap.put(language2, 200);

        System.out.println(identityMap);

        System.out.println();

        System.out.println("language1 == language2 : " + (language1 == language2));

        System.out.println("language1.equals(language2) : " + language1.equals(language2));
    }
}