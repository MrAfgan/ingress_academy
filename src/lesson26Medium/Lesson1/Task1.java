package lesson26Medium.Lesson1;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> names = List.of("Samir", "Ayaz", "Mahir", "Adil", "Zakir", "Taleh", "Akif", "Qasim", "Ayxan", "Vidadi", "Alim", "Nazim");
        names.stream()
                .filter(s -> s.toLowerCase()
                        .startsWith("a")).sorted()
                .forEach(System.out::println);
    }
}