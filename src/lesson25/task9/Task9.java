package lesson25.task9;

import java.util.List;
import java.util.function.Predicate;

public class Task9 {
    static Predicate<String> longerThanFive = s -> s.length() > 5;

    public static void filter(List<String> list, Predicate<String> predicate) {
        for (String s : list) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }
}
