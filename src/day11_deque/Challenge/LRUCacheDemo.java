package day11_deque.Challenge;

import java.util.ArrayDeque;
import java.util.Deque;

public class LRUCacheDemo {

    public static void main(String[] args) {

        Deque<Integer> cache = new ArrayDeque<>();

        int capacity = 3;

        int[] pages = {1, 2, 3, 2, 4};

        for (int page : pages) {

            System.out.println("Cache: " + cache);


            if (cache.contains(page)) {
                cache.remove(page);
            } else if (cache.size() == capacity) {
                cache.removeFirst();
            }

            cache.addLast(page);
        }

        System.out.println("Cache: " + cache);
    }
}