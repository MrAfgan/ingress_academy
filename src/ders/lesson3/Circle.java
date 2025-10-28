package ders.lesson3;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        /*double radius = 7.5;
        C = 2πr perimetrin hesablanma qaydasi
       S = πr² sahenin hesablanma qaydasi
        double perimetr = 2 * Math.PI * radius;
        double area = Math.PI * (radius * radius);*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the radius of circle:");
        double radius = scan.nextDouble();
        System.out.println("Perimeter is: " + 2 * Math.PI * radius);
        System.out.println("Area is: " + Math.PI * (radius * radius));



    }
}
