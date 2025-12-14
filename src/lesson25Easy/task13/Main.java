package lesson25Easy.task13;

import java.util.List;

public class Main extends Task13 {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Acer laptop", 1299.99),
                new Product("Samsung 4K TV", 1599.00),
                new Product("Vacuum Cleaner", 699.99),
                new Product("Aspirator", 159.00)
        );
        priceUpdater(products, priceIncreaser);
    }
}
