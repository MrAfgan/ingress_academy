package lesson25Easy.task8;

import java.util.ArrayList;
import java.util.List;

public class Main extends Task8 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(3);
        numbers.add(7);
        numbers.add(8);
        squarer(numbers, consumer);
    }
}