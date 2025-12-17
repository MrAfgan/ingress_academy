package lesson26Medium.lesson7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        List<String> sentences = List.of(
                "Hello Java",
                "its fourth month",
                "since im learning you",
                "Last two month of java learning lessons"
        );
        System.out.println(
                sentences.stream()
                        .flatMap(s -> Arrays.stream(s.split(" ")))
                        .map(String::toLowerCase)
                        .collect(Collectors.toSet()));
    }
}
