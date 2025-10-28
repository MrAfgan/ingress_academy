package ders.lesson3;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        System.out.println("Farenheit deyerini daxil edin.");
        Scanner scan = new Scanner(System.in);
        double fahrenheit = scan.nextDouble();
        System.out.println(fahrenheit + " °F is equal to " + (fahrenheit - 32) * 5 / 9 + " °C in Celsius");

    }
}
