import model.Product;
import search.LinearSearch;
import search.BinarySearch;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Shirt", "Fashion"),
                new Product(3, "Mouse", "Electronics"),
                new Product(4, "Shoes", "Fashion"),
                new Product(5, "Phone", "Electronics")
        };

        //Available Products
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.println(" - " + product);
        }

        System.out.println("\n--- Search Results ---");

        // Linear Search
        System.out.println(" Linear Search Result:");
        int index1 = LinearSearch.search(products, "Mouse");
        System.out.println(index1 >= 0 ? "Found: " + products[index1] : "Not found");

        // Sort array by name for Binary Search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        // Binary Search
        System.out.println("\n Binary Search Result:");
        int index2 = BinarySearch.search(products, "Mouse");
        System.out.println(index2 >= 0 ? "Found: " + products[index2] : "Not found");
    }
}
