package lesson26Easy.task7;

import java.util.Comparator;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<Integer> numbs = List.of(9, 2, 1, 4, 11, 6, 22, 8, 9, 10);

        numbs.stream()
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);

//        Optional<Integer> maxNumber =numbs.stream().max(Integer::compareTo);
//        maxNumber.ifPresent(max-> System.out.println("Max number is:"+max));
    }
}
