package lesson25Medium.task5;

import java.util.HashMap;
import java.util.Map;

public class Main extends Lesson5{
    public static void main(String[] args) {
        Map<Integer,String> personal= new HashMap<>();
        personal.putIfAbsent(100,"Abbas");
        personal.putIfAbsent(101,"Saleh");
        personal.putIfAbsent(102,"Vasif");
        personal.putIfAbsent(103,"Veli");
        printer(personal,printInfo);

    }
}