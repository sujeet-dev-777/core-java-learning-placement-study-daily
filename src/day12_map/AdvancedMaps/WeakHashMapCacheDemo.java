package day12_map.AdvancedMaps;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapCacheDemo {

    public static void main(String[] args) {

        WeakHashMap<String, String> cache = new WeakHashMap<>();

        // Strong references to keys
        String key1 = new String("User1");
        String key2 = new String("User2");
        String key3 = new String("User3");

        // Adding entries to WeakHashMap
        cache.put(key1, "Sujeet");
        cache.put(key2, "Rahul");
        cache.put(key3, "Amit");

        System.out.println("Before removing strong references:");
        System.out.println(cache);

        // Remove strong references
        key1 = null;
        key2 = null;

        // Request Garbage Collector to run
        System.gc();

        // Give GC some time
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After Garbage Collection:");
        System.out.println(cache);

        // Display remaining entries
        System.out.println("Remaining Entries:");

        for (Map.Entry<String, String> entry : cache.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}