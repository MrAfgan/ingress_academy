package lesson25Medium.task3;

import java.util.List;

public class Main extends Lesson3 {
    public static void main(String[] args) {
        List<String> names = List.of("Ayaz", "Zara", "Avaz", "Nazim");
        transform(names, upperCasePrint);
        System.out.println();
        transform(names, addSuffix);
        System.out.println();
        transform(names, reversPrint);
    }
}
