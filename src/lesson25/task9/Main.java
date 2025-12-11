package lesson25.task9;

import java.util.ArrayList;
import java.util.List;

public class Main extends Task9{
    public static void main(String[] args) {
        List<String> people=new ArrayList<>();
        people.add("Ali");
        people.add("Semseddin");
        people.add("Kanan");
        people.add("Nariman");
        people.add("Oqtay");
        people.add("Kerem");
        people.add("Vidadi");
        filter(people, longerThanFive);
    }
}
