package lesson26Medium.lesson2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> one = List.of(1, 3, 5, 7, 9, 7, 10);
        List<Integer> two = List.of(2, 4, 6, 8, 0, 6, 7, 3);
//        Stream.of(one.stream(), two.stream())
//                .flatMap(i -> i)
//                .collect(Collectors.toSet())
//                .stream()
//                .sorted()
//                .forEach(System.out::println);
//        Stream.concat(one.stream(), two.stream()).collect(Collectors.toSet())
//                .stream()
//                .sorted().
//                forEach(System.out::println);
        Stream.concat(one.stream(), two.stream()).distinct()
                .sorted()
                .forEach(System.out::println);
    }
}