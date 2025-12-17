package lesson26Medium.lesson3;

import java.util.Comparator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Samir", "Ayaz",
                "Mahir", "Adil",
                "Zakir", "Taleh",
                "Akif", "Qasim",
                "Ayxan", "Vidadi",
                "Alim", "Nazim");
        names.stream()
                .max(Comparator.comparing(String::length))
                .ifPresent(System.out::println);
    }
}
