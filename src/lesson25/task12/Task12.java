package lesson25.task12;

import java.util.List;
import java.util.function.Predicate;

public class Task12 {
    static Predicate<Integer> positiveNumb = i -> i > 0;

    public static void filter(List<Integer> list, Predicate<Integer> predicate) {
        for (int i : list) {
            if (predicate.test(i)) {
                System.out.println(i);
            }
        }
    }
}
