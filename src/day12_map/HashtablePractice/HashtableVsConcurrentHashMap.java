package day12_map.HashtablePractice;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class HashtableVsConcurrentHashMap {

    public static void main(String[] args) {

        // Creating Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(1, "Java");
        hashtable.put(2, "Python");
        hashtable.put(3, "C++");

        // Creating ConcurrentHashMap
        ConcurrentHashMap<Integer, String> concurrentMap = new ConcurrentHashMap<>();

        concurrentMap.put(1, "Java");
        concurrentMap.put(2, "Python");
        concurrentMap.put(3, "C++");

        // Printing both maps
        System.out.println("Hashtable : " + hashtable);
        System.out.println("ConcurrentHashMap : " + concurrentMap);
    }
}

/*
Comparison:

1. Hashtable
   - Fully synchronized.
   - Thread-safe.
   - Slower because every method is synchronized.
   - Does NOT allow null key or null value.

2. ConcurrentHashMap
   - Thread-safe using finer-grained synchronization.
   - Faster than Hashtable in multi-threaded applications.
   - Preferred in modern Java applications.
   - Does NOT allow null key or null value.
*/