package lesson25.task11;

import java.util.Scanner;

public class Main extends Task11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("2 eded daxil et");
        int a= sc.nextInt();
        System.out.println("ikinci ededi daxil et");
        int b= sc.nextInt();
        addition.calculate(a,b);
    }
}
