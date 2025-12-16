package lesson25Medium.task2;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lesson2 {
    static Predicate<Integer> isPositive = n -> n > 0;
    static Consumer<Integer> multiply = n -> System.out.println("this number is positive - "+(n * 2));

    public static void filter(List<Integer> list, Predicate<Integer> predicate,Consumer<Integer>consumer ) {
        for (int i : list) {
            if (predicate.test(i)){
                consumer.accept(i);
                System.out.println(i);}
    }
    }


}
