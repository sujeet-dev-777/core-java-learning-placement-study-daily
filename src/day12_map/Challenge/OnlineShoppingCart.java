package day12_map.Challenge;

import java.util.HashMap;
import java.util.Map;

class Product {

    private int productId;
    private String productName;
    private double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
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
}

public class OnlineShoppingCart {

    public static void main(String[] args) {

        Map<Integer, Product> productCatalog = new HashMap<>();

        productCatalog.put(101, new Product(101, "Laptop", 55000));

        productCatalog.put(102, new Product(102, "Mouse", 800));

        productCatalog.put(103, new Product(103, "Keyboard", 1500));

        Map<Integer, Integer> shoppingCart = new HashMap<>();

        addToCart(shoppingCart, 101, 1);
        addToCart(shoppingCart, 102, 2);
        addToCart(shoppingCart, 103, 1);

        System.out.println("=== Shopping Cart ===");

        double totalAmount = 0;

        for (Map.Entry<Integer, Integer> entry : shoppingCart.entrySet()) {

            int productId = entry.getKey();
            int quantity = entry.getValue();

            Product product = productCatalog.get(productId);

            double itemTotal = product.getPrice() * quantity;

            totalAmount += itemTotal;

            System.out.println(product.getProductName() + " | Quantity: " + quantity + " | Price: ₹" + product.getPrice() + " | Total: ₹" + itemTotal);
        }

        System.out.println("Cart Total: ₹" + totalAmount);
    }

    public static void addToCart(Map<Integer, Integer> shoppingCart, int productId, int quantity) {

        shoppingCart.merge(productId, quantity, Integer::sum);
    }
}