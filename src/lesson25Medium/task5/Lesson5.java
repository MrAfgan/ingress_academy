package lesson25Medium.task5;

import java.util.Map;
import java.util.function.BiConsumer;

public class Lesson5 {
    static BiConsumer<Integer, String> printInfo = (i,s) -> System.out.println("Id: " + i + " Name: " + s);
    public static void printer(Map<Integer,String> map,BiConsumer<Integer,String>biConsumer){
        for (int i: map.keySet()){
            biConsumer.accept(i,map.get(i));
        }
    }
}
