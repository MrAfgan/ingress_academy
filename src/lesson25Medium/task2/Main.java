package lesson25Medium.task2;

import java.util.List;

public class Main extends Lesson2 {
    public static void main(String[] args) {
        List<Integer>numbs=List.of(2,4,6,-3,-5,-7,9);
        filter(numbs,isPositive,multiply);
    }
}
