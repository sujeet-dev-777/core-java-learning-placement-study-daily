package day14_traversal.IteratorPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemoveMapEntriesIterator {

    public static void main(String[] args) {

        HashMap<Integer, Integer> studentMarks = new HashMap<>();

        studentMarks.put(101, 75);
        studentMarks.put(102, 32);
        studentMarks.put(103, 85);
        studentMarks.put(104, 25);

        System.out.println("Before removal: " + studentMarks);

        Iterator<Map.Entry<Integer, Integer>> iterator = studentMarks.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<Integer, Integer> entry = iterator.next();

            if (entry.getValue() < 40) {
                iterator.remove();
            }
        }

        System.out.println("After removal: " + studentMarks);
    }
}