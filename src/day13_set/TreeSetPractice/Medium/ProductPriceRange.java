package day13_set.TreeSetPractice.Medium;

import java.util.TreeSet;

public class ProductPriceRange {

    public static void main(String[] args) {

        TreeSet<Integer> productPrices = new TreeSet<>();

        productPrices.add(499);
        productPrices.add(799);
        productPrices.add(999);
        productPrices.add(1299);
        productPrices.add(1499);
        productPrices.add(1999);
        productPrices.add(2499);

        int budget = 1200;

        System.out.println("Product Prices: " + productPrices);

        System.out.println("Cheapest Price: " + productPrices.first());

        System.out.println("Most Expensive Price: " + productPrices.last());

        System.out.println("Next Higher Price: " + productPrices.higher(budget));

        System.out.println("Best Price Within Budget: " + productPrices.floor(budget));

        System.out.println("Prices Up To Budget: " + productPrices.headSet(budget, true));

        System.out.println("Prices Above Budget: " + productPrices.tailSet(budget, false));
    }
}