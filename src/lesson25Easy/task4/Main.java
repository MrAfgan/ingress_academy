package lesson25Easy.task4;

import java.util.List;

public class Main extends Task4 {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Laptop", 1200.99),
                new Product("TV", 699.99),
                new Product("Washer", 899.99),
                new Product("Iphone 17 Pro Max", 3650.99)
        );
        priceReduce(products, discount);
//        products.forEach(System.out::println);

    }
}
