package lesson27.task1;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Map<String, List<Integer>> students = new HashMap<>();
        students.put("Ali", new ArrayList<>());
        students.put("Murad", new ArrayList<>());
        students.put("Elvin", new ArrayList<>());
        students.put("Kamran", new ArrayList<>());
        addScore(students, "Ali", 20);
        addScore(students, "Ali", 15);
        addScore(students, "Ali", 16);
        addScore(students, "Murad", 18);
        addScore(students, "Murad", 22);
        addScore(students, "Murad", 15);
        addScore(students, "Elvin", 20);
        addScore(students, "Elvin", 16);
        addScore(students, "Kamran", 18);
        addScore(students, "Kamran", 10);
        addScore(students, "Kamran", 12);

        averageScore(students, "Ali");

        System.out.println(highestScoreStudent(students));


    }

    public static void addScore(Map<String, List<Integer>> students, String StudentName, int score) {
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

    public static String highestScoreStudent(Map<String, List<Integer>> students) {
        String topStudent = null;
        double maxAverage = -1;
        for (Map.Entry<String, List<Integer>> entry : students.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                double eachScore = entry.getValue()
                        .stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0);
                if (eachScore > maxAverage) {
                    maxAverage = eachScore;
                    topStudent = entry.getKey();
                }
            }
        }
        return topStudent;
    }
}

