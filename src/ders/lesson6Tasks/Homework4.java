package ders.lesson6Tasks;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int maxnumber;
        int a= sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        maxnumber=a;
        if (b>maxnumber) maxnumber=b;
        if (c>maxnumber) maxnumber=c;
        System.out.println(maxnumber);
    }
}
