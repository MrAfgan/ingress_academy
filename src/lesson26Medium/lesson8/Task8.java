package lesson26Medium.lesson8;

import java.util.List;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Abbas",
                "Sabah", "Abseron",
                "Bayram", "Qarabag",
                "Zakir", "Taleh",
                "Babek", "Tahir",
                "salam", "zarafat");
        names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.groupingBy(s -> s.charAt(0)))
                .forEach((key, value) -> System.out.println(key + "->" + value));
    }
}
