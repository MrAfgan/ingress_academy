package ders.randomlessonsandclasses;

import java.util.Scanner;

public class Kalkulyator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ilk reqemi daxil edin.");
        double a = scan.nextDouble();
        System.out.println("Emeliyyati daxil edin (+) (-) (*) (/)");
        String emeliyyat = scan.next();
        System.out.println("Ikinci reqemi daxil edin.");
        double b = scan.nextDouble();
        switch (emeliyyat) {
            case "+" -> System.out.println("Cavab " + (a + b));
            case "-" -> System.out.println("Cavab " + (a - b));
            case "*" -> System.out.println("Cavab " + (a * b));
            case "/" -> System.out.println("Cavab " + (a / b));
        }
    }
}