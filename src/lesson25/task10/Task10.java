package lesson25.task10;

import java.util.List;
import java.util.function.Consumer;

public class Task10 {
    static Consumer<String> logAdder = msg -> System.out.println("Activity: " + msg);

    public static void logResult(List<String> list, Consumer<String> consumer) {
        for (String s : list) {
            consumer.accept(s);
        }
    }
}
