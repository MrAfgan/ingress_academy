package lesson25Medium.task3;

import java.util.List;

public class Lesson3 {
    static Transformer upperCasePrint = s-> s.toUpperCase();
    static Transformer reversPrint = s -> String.valueOf(new StringBuilder(s).reverse());
    static Transformer addSuffix = s-> s+("_in Java");
    public static void transform(List<String> list, Transformer transform) {
        for (String s : list) {
            System.out.println(transform.transformation(s));
        }
    }
}
