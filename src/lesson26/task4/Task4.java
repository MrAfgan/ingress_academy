package lesson26.task4;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbs = List.of(1, 9, 2, 4, 5, 6, 2, 8, 6, 9);
        System.out.println(numbs.stream().collect(Collectors.toSet()));
    }
}
