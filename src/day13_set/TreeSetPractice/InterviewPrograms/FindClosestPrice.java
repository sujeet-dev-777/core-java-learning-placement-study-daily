package day13_set.TreeSetPractice.InterviewPrograms;

import java.util.TreeSet;

public class FindClosestPrice {

    public static void main(String[] args) {

        TreeSet<Integer> prices = new TreeSet<>();

        prices.add(500);
        prices.add(800);
        prices.add(1000);
        prices.add(1500);
        prices.add(2000);
        prices.add(2500);

        int budget = 1200;

        Integer bestPriceWithinBudget = prices.floor(budget);
        Integer nextHigherPrice = prices.ceiling(budget);

        System.out.println("Prices: " + prices);
        System.out.println("Budget: " + budget);

        System.out.println("Best Price Within Budget: " + bestPriceWithinBudget);

        System.out.println("Next Available Price: " + nextHigherPrice);
    }
}