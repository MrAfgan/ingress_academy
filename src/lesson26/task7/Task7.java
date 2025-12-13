package lesson26.task7;

import java.util.List;
import java.util.Optional;

public class Task7 {
    public static void main(String[] args) {
        List<Integer> numbs = List.of(9, 2, 1, 4, 11, 6, 22, 8, 9, 10);
        Optional<Integer> maxNumber =numbs.stream().max(Integer::compareTo);
        maxNumber.ifPresent(max-> System.out.println("Max number is:"+max));
    }
}
