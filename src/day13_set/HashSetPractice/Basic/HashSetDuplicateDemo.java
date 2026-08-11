package day13_set.HashSetPractice.Basic;

import java.util.HashSet;

public class HashSetDuplicateDemo {

    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();

        System.out.println("Add Mumbai: " + cities.add("Mumbai"));
        System.out.println("Add Pune: " + cities.add("Pune"));
        System.out.println("Add Mumbai again: " + cities.add("Mumbai"));
        System.out.println("Add Nashik: " + cities.add("Nashik"));

        System.out.println("Cities: " + cities);
    }
}