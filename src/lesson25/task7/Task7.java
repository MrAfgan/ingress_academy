package lesson25.task7;

import java.util.List;
import java.util.function.Predicate;

public class Task7 {
    static Predicate<String> minLengthSixName = s -> s.length() >= 6;

    public static void filter(List<String> list, Predicate<String> predicate) {
        for (String s : list) {
            if (predicate.test(s)){
                System.out.println(s);
            }
        }
    }
}