package day13_set.LinkedHashSetPractice.Basic;

import java.util.LinkedHashSet;

public class LinkedHashSetMethodsDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> cities = new LinkedHashSet<>();

        // add()
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Nagpur");
        cities.add("Nashik");

        System.out.println("Cities: " + cities);

        // contains()
        System.out.println("Contains Pune: " + cities.contains("Pune"));

        // size()
        System.out.println("Number of cities: " + cities.size());

        // remove()
        cities.remove("Nagpur");

        System.out.println("After removing Nagpur: " + cities);

        // isEmpty()
        System.out.println("Is empty: " + cities.isEmpty());

        // clear()
        cities.clear();

        System.out.println("After clear: " + cities);

        System.out.println("Is empty: " + cities.isEmpty());
    }
}