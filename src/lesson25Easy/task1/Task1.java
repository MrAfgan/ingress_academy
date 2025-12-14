package lesson25Easy.task1;

import java.util.List;
import java.util.function.Predicate;

public class Task1 {
    static Predicate<Integer> isEven = n -> n % 2 == 0;

    public static void filterNumbers(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer n:list){
            if (predicate.test(n)){
                System.out.println(n);
            }
        }
    }
}