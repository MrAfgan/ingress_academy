package lesson25.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main extends Task2 {
    public static void main(String[] args) {
//        List<String>names= Arrays.asList("AA","BB","","CC","DD","EE");
        List<String>names1=new ArrayList<>();
        names1.add("AA");
        names1.add("");
        names1.add("BB");
        names1.add("CC");
        names1.add("DD");
        names1.add("");
        names1.add("EE");
        filterNames(names1,isNotEmpty);
    }
}
