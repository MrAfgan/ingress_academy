package lesson25.task4;

import java.util.List;
import java.util.function.Consumer;

public class Task4 {
    static Consumer<Product> discount = p -> p.setPrice(p.getPrice() * 0.9);

    public static void priceReduce(List<Product> list, Consumer<Product> consumer) {
        for (Product p : list) {
            consumer.accept(p);
            System.out.println(p + " Price after 10% discount applied!");
        }
    }

}