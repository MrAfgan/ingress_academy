package lesson27tasks.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, List<Integer>> students = new HashMap<>();
        students.computeIfAbsent("Adil", string -> new ArrayList<Integer>()).add(11);
        students.get("Adil").add(10);
        students.get("Adil").add(10);
        students.computeIfAbsent("Fuad", string -> new ArrayList<Integer>()).add(15);
        students.get("Fuad").add(12);
        students.get("Fuad").add(7);
        students.computeIfAbsent("Samir", string -> new ArrayList<Integer>()).add(17);
        students.get("Samir").add(15);
        students.get("Samir").add(17);
        students.computeIfAbsent("Vahid", string -> new ArrayList<Integer>()).add(8);
        students.get("Vahid").add(4);
        students.get("Vahid").add(7);
        System.out.println(avergescore(students.get("Vahid")));
    }
    public static double avergescore(List<Integer> scores){
        double total=0;
        for (int i:scores){
            total+=i;
        }
        return total/scores.size();
    }

    public static int addscore(Map<String, List<Integer>> students) {

        return 0;
    }
}
