package day15_sorting.ComparatorPractice;


import java.util.ArrayList;
import java.util.Comparator;
class Product {

    private int productId;
    private String productName;
    private double price;
    private double rating;

    public Product(
            int productId,
            String productName,
            double price,
            double rating) {

        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.rating = rating;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return productId + " - " + productName + " - ₹" + price + " - Rating: " + rating;
    }
}



public class ProductPriceSorting {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(101, "Laptop", 60000, 4.5));
        products.add(new Product(102, "Mouse", 800, 4.2));
        products.add(new Product(103, "Keyboard", 1500, 4.4));
        products.add(new Product(104, "Monitor", 12000, 4.6));

        products.sort(Comparator.comparingDouble(Product::getPrice));

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
