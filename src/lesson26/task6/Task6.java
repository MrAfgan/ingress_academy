package lesson26.task6;

import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> numbs = List.of(1, 2, 9, 4, 11, 6, 22, 8, 9, 10);
        System.out.println(numbs.stream().filter(n -> n > 10).findFirst());
    }
}
