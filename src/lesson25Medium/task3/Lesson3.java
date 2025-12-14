package lesson25Medium.task3;

import java.util.Comparator;
import java.util.List;

public class Lesson3 {
    static Transformer upperCasePrint = s-> System.out.println(s.toUpperCase());
    static Transformer reversPrint = s -> s.replace((CharSequence) s, (CharSequence) Comparator.reverseOrder());
    static Transformer addSuffix = s-> System.out.println(s+"_in Java");
    public static void trasformer(List<String>list, Transformer transformer){
        for (String s: list){
            transformer.transform(s);
        }
    }
}
