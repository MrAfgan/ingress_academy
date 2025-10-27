package ders.lesson15Tasks;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Map<String, List<Integer>> Students = new HashMap<>();
        Students.put("Miri", new ArrayList<>());
        Students.get("Miri").add(18);
        Students.get("Miri").add(22);

        Students.putIfAbsent("Sanan", new ArrayList<>());
        Students.get("Sanan").add(25);
        Students.get("Sanan").add(15);
        Students.get("Sanan").add(30);

        Students.computeIfAbsent("Tural", _ -> new ArrayList<>()).add(30);
        Students.get("Tural").add(20);

        Students.computeIfAbsent("Murad", _ -> new ArrayList<>()).add(21);
        Students.get("Murad").add(10);

        Students.computeIfAbsent("Nurlan", _ -> new ArrayList<>()).add(32);
        Students.get("Nurlan").add(15);
        System.out.println(Students);

        double mirisScore = averageScore(Students.get("Miri"));
        System.out.println("Miris average score: " + mirisScore);

        double sanansScore = averageScore(Students.get("Sanan"));
        System.out.println("Sanans average score: " + sanansScore);

        double turalsScore = averageScore(Students.get("Tural"));
        System.out.println("Turals average score: " + turalsScore);

        double muradsScore = averageScore(Students.get("Murad"));
        System.out.println("Murads average score: " + muradsScore);

        double nurlansScore = averageScore(Students.get("Nurlan"));
        System.out.println("Nurlans average score: " + nurlansScore);

        System.out.println(Students);
        String highestScorer = findHighestScore(Students);
        System.out.println(highestScorer);
    }

    public static double averageScore(List<Integer> scores) {
        int total = 0;
        for (int s : scores) {
            total +=s;
        }
        return (double) total / scores.size();
    }
    public static String findHighestScore(Map<String, List<Integer>> students) {
        String topStudent = null;
        double topAverage = 0;
        for (Map.Entry<String, List<Integer>> entry : students.entrySet()) {
            double average = averageScore(entry.getValue());
            if (average > topAverage) {
                topAverage = average;
                topStudent = entry.getKey();
            }
        }
        return topStudent;
    }
}


