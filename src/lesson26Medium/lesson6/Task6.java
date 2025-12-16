package lesson26Medium.lesson6;

import java.util.Arrays;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<String> names = List.of("Abbas", "Sabah", "Abseron", "Bomba", "Qarabag");
        System.out.println(
                names.stream()
                        .flatMap(n -> Arrays.stream(n.split("")))
                        .map(String::toLowerCase)
                        .filter(s -> s.equals("a")).count());
    }
}
