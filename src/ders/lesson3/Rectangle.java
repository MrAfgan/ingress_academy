package ders.lesson3;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter width of rectangle with cm:");
        double width = scan.nextDouble();
        System.out.println("Enter height of rectangle with cm:");
        double height = scan.nextDouble();
        System.out.println("Area of rectangle is: " + width * height + " cm");
        System.out.println("Perimeter of rectangle is: " + 2 * (width * height)+ " cm");

    }
}