package day15_sorting.ComparablePractice;

import java.util.ArrayList;
import java.util.Collections;

class Product implements Comparable<Product> {

    private int productId;
    private String productName;
    private double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public int compareTo(Product otherProduct) {
        return Double.compare(this.price, otherProduct.price);
    }

    @Override
    public String toString() {
        return productId + " - " + productName + " - ₹" + price;
    }
}

public class ProductSortByPrice {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(103, "Keyboard", 1200));
        products.add(new Product(101, "Mouse", 700));
        products.add(new Product(102, "Monitor", 8500));

        Collections.sort(products);

        for (Product product : products) {
            System.out.println(product);
        }
    }
}