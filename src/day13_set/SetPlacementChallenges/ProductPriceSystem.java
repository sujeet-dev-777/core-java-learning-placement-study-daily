package day13_set.SetPlacementChallenges;

import java.util.NavigableSet;
import java.util.TreeSet;

public class ProductPriceSystem {

    public static void main(String[] args) {

        NavigableSet<Integer> prices = new TreeSet<>();

        prices.add(499);
        prices.add(799);
        prices.add(999);
        prices.add(1299);
        prices.add(1499);
        prices.add(1999);

        int customerBudget = 1200;

        System.out.println("Product Prices: " + prices);

        System.out.println("Cheapest Price: " + prices.first());

        System.out.println("Highest Price: " + prices.last());

        System.out.println("Best Price Within Budget: " + prices.floor(customerBudget));

        System.out.println("Next Higher Price: " + prices.higher(customerBudget));
    }
}