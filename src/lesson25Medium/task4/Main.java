package lesson25Medium.task4;

import java.util.List;

public class Main extends Lesson4 {
    public static void main(String[] args) {
        List<String> names = List.of("Abbas", "Sabah", "Abseron", "Bomba","Qarabag");
        filter(names,dualFilter);
        System.out.println();
        filter(names,oneParameterFilter);
    }
}
