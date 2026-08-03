package day12_map.LinkedHashMapPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheDemo {

    public static void main(String[] args) {

        int capacity = 3;

        LinkedHashMap<Integer, String> cache = new LinkedHashMap<>();

        int[] pages = {1, 2, 3, 2, 4};

        for (int page : pages) {

            if (cache.containsKey(page)) {
                cache.remove(page);
            } else if (cache.size() == capacity) {

                Integer firstKey = cache.keySet().iterator().next();
                cache.remove(firstKey);
            }

            cache.put(page, "Page " + page);
        }

        System.out.println("Final Cache");

        for (Map.Entry<Integer, String> entry : cache.entrySet()) {

            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}