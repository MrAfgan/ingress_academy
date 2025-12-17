package lesson27.task1;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Map<String, List<Integer>> students = new HashMap<>();
        students.put("Ali", new ArrayList<>());
        students.put("Murad", new ArrayList<>());
        students.put("Elvin", new ArrayList<>());
        students.put("Kamran", new ArrayList<>());


    }

    public static void addscore(Map<String, List<Integer>> students, String StudentName, int score) {
        if (students.containsKey(StudentName)) {
            students.get(StudentName)
                    .add(score);
        } else students.computeIfAbsent(StudentName, _ -> new ArrayList<>())
                .add(score);
    }

    public static void averageScore(Map<String, List<Integer>> students, String StudentName) {
        List<Integer> scores = students.get(StudentName);
        if (students.containsKey(StudentName)) {
            if (students.get(StudentName).isEmpty()) {
                System.out.println("Student has zero score");

            } else
                scores.stream()
                        .mapToInt(Integer::intValue)
                        .average().ifPresent(System.out::println);
        } else System.out.println("No such student!");
    }

    public static String highestAverage(Map<String, List<Integer>> students,String StudentName) {
        String topStudent = null;
        double maxAverage = 0;

        for (Map.Entry<String, List<Integer>> entry : students.entrySet()) {
            if (!students.get(StudentName).isEmpty()){
            }

        }return topStudent;
    }
}

