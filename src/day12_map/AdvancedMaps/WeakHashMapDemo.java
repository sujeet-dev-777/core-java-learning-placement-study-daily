package day12_map.AdvancedMaps;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

    public static void main(String[] args) throws InterruptedException {

        WeakHashMap<Integer, String> weakMap = new WeakHashMap<>();

        Integer employeeId = new Integer(101);

        weakMap.put(employeeId, "Rahul");

        System.out.println("Before Garbage Collection:");
        System.out.println(weakMap);

        employeeId = null;

        System.gc();

        Thread.sleep(5000);

        System.out.println();

        System.out.println("After Garbage Collection:");
        System.out.println(weakMap);
    }
}