package lesson25Medium.task1;

import java.util.List;

public class Main extends Lesson1 {
    public static void main(String[] args) {
        List<String> names = List.of("Ayaz", "Zara", "Avaz", "Nazim");
        filter(names,dualPredicate);
    }
}
