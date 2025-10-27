package ders.lesson7;

import java.util.Scanner;

public class ucVeBes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eded = sc.nextInt();
        if (eded % 3 == 0 && eded % 5 == 0){
            System.out.println("eded 3e ve 5e bolunur");


        } else{
            System.out.println("bolunmur");
        }
    }
}
