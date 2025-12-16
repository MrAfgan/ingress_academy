package lesson26Easy.task2;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Samir",
                "Imran",
                "miKayIL",
                "samir",
                "kaziM",
                "Vidadi",
                "Nariman"
        );
        names.stream()
                .map(String::toUpperCase).
                forEach(System.out::println);
    }
}
