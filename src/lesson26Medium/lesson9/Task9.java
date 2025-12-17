package lesson26Medium.lesson9;

import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        List<Integer> numbs = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbs.stream()
                .skip(3).limit(5)
                .forEach(System.out::println);
    }
}
