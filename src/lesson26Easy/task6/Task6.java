package lesson26Easy.task6;

import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> numbs = List.of(1, 2, 9, 4, 11, 6, 22, 8, 9, 10);
        numbs.stream()
                .filter(n -> n > 10)
                .findFirst()
                .ifPresent(System.out::println);

//        Optional<Integer> greaterThenTen = numbs.stream().filter(n -> n > 10).findFirst();
//        greaterThenTen.ifPresent(System.out::println);
    }
}
