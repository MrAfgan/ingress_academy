package ders.lesson6;

import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        int biggest = (numb >= 0) ? numb : numb * -1;
        System.out.println(biggest);

    }
}
