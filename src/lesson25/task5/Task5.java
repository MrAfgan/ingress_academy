package lesson25.task5;

import java.util.List;
import java.util.function.Consumer;

public class Task5 {
    static Consumer<String> names = s -> System.out.println(s.toUpperCase());

    public static void upperCase(List<String> list, Consumer<String> consumer) {
        for (String s : list) {
            consumer.accept(s);
        }
    }
}
