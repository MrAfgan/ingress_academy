package lesson25.task2;

import java.util.List;
import java.util.function.Predicate;

public class Task2 {
   static Predicate<String> isNotEmpty= s-> !s.isEmpty();
    public static void filterNames(List<String>list,Predicate<String>predicate){
        for (String st:list){
            if (predicate.test(st)){
                System.out.println(st);
            }
        }
    }
}
