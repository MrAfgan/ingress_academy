package ders.lesson3homeworks;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        System.out.println("Input the number of minutes:");
        Scanner scan = new Scanner(System.in);
        double minute =  scan.nextDouble();
        double years = minute / 525600;
        System.out.printf("%.0f minutes is approximately %.1f",minute, years);

    }
}
