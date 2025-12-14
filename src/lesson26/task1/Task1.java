package lesson26.task1;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbs = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbs.stream()
                .filter(n->n%2==0)
                .forEach(System.out::println);
    }
}
