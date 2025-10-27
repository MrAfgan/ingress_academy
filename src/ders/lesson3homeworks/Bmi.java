package ders.lesson3homeworks;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your weight in kilograms:");
        String weightInput = scan.nextLine();
        weightInput = weightInput.replace(',', '.');
        double kilograms = Double.parseDouble(weightInput);

        System.out.println("Please input your height in meters:");
        String heightInput = scan.nextLine();
        heightInput = heightInput.replace(',', '.');
        double heightCm = Double.parseDouble(heightInput);

        double meters = heightCm / 100;
        double Bmi = kilograms / (meters * meters);
        System.out.printf("Your BMI index is: %.2f", Bmi);
    }
}
