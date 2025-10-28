package ders.lesson3;

import java.util.Scanner;

public class InchToMeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much inches you want convert to meter ?");
        double inch = scan.nextDouble();
        System.out.println(inch + " is " + inch/39.37 + " meters");
    }
}
