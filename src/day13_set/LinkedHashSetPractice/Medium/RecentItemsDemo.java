package day13_set.LinkedHashSetPractice.Medium;

import java.util.LinkedHashSet;

public class RecentItemsDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> viewedProducts = new LinkedHashSet<>();

        viewedProducts.add("Laptop");
        viewedProducts.add("Mouse");
        viewedProducts.add("Keyboard");
        viewedProducts.add("Laptop");
        viewedProducts.add("Monitor");
        viewedProducts.add("Mouse");

        System.out.println("Viewed Products:");

        for (String product : viewedProducts) {
            System.out.println(product);
        }
    }
}