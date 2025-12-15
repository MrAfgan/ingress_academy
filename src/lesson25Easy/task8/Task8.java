package lesson25Easy.task8;

import java.util.List;
import java.util.function.Consumer;

public class Task8 {
    static Consumer<Integer> consumer = i-> System.out.println(i*i);

    public static void squarer(List<Integer> list, Consumer<Integer> consumer) {
        for (Integer num : list) {
            consumer.accept(num);
        }
    }
}