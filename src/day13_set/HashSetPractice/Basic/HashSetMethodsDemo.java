package day13_set.HashSetPractice.Basic;

import java.util.HashSet;

public class HashSetMethodsDemo {

    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();

        // add()
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Fruits: " + fruits);

        // size()
        System.out.println("Size: " + fruits.size());

        // contains()
        System.out.println("Contains Mango: " + fruits.contains("Mango"));
        System.out.println("Contains Grapes: " + fruits.contains("Grapes"));

        // remove()
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // isEmpty()
        System.out.println("Is set empty: " + fruits.isEmpty());

        // clear()
        fruits.clear();
        System.out.println("After clear: " + fruits);

        System.out.println("Is set empty now: " + fruits.isEmpty());
    }
}