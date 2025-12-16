package lesson26Medium.lesson4;

import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbs = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbs.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .average()
                .ifPresent(System.out::println);
    }
}
