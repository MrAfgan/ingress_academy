package gptLessons;

import java.util.Scanner;

public class Mikayil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age <= 17) {
            System.out.println("yeniyetme");

        } else if (age <= 64) {
            System.out.println("Pensiya yasin catmir");

        } else System.out.println("Pensioner");
    }
}
