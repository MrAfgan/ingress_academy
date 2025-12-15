package lesson25Medium.task1;

import java.util.List;
import java.util.function.Predicate;

public class Lesson1 {

    static Predicate<String> startsWithA = s -> s.toLowerCase().startsWith("a");
    static Predicate<String> endsWithZ = s -> s.toLowerCase().endsWith("z");
    static Predicate<String> dualPredicate = startsWithA.and(endsWithZ);

    public static void filter(List<String> list, Predicate<String> predicate) {
        for (String s : list)
            if (predicate.test(s))
                System.out.println(s);


    }
}

