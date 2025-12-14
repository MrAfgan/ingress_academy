package lesson26.task5;

import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbs = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(numbs.stream()
                .filter(n -> n % 2 == 0)
                .count());
    }
}
