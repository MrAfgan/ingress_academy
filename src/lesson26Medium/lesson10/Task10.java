package lesson26Medium.lesson10;

import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Abbas", "Sabah",
                "Abseron", "Bomba",
                "Qarabag");
        names.stream()
                .map(String::toUpperCase)
                .filter(s -> s.contains("AB"))
                .findAny().ifPresent(System.out::println);
    }
}
