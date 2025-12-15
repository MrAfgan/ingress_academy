package lesson25Medium.task4;

import java.util.List;
import java.util.function.Predicate;

public class Lesson4 {
    static Predicate<String> isContains = s -> s.toLowerCase().contains("ab");
    static Predicate<String> isGreaterThanFive = s -> s.length() > 5;
    static Predicate<String> dualFilter = isContains.and(isGreaterThanFive);
    static Predicate<String> oneParameterFilter = isContains.or(isGreaterThanFive);

    public static void filter(List<String> list, Predicate<String> predicate) {
        for (String s : list) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }
}
