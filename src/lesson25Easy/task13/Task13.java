package lesson25Easy.task13;

import java.util.List;
import java.util.function.Consumer;

public class Task13 {
    static Consumer<Product> priceIncreaser = p -> p.setPrice(p.getPrice() * 1.05);

    public static void priceUpdater(List<Product> list, Consumer<Product> consumer) {
        for (Product product : list) {
            consumer.accept(product);
            System.out.println(product+". Price 5% increased!!");
        }
    }
}
