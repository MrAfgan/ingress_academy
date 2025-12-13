package lesson26.task3;

import java.util.List;

public class Task3 {
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
        names.stream().filter(s->s.length()>5).forEach(System.out::println);
    }
}
