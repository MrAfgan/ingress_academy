package lesson25Easy.task12;

import java.util.Arrays;
import java.util.List;

public class Main extends Task12 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, -7, 15, -1, 0, 44, 55, 3, -99);
        filter(numbers, positiveNumb);
    }
}
