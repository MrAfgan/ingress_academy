package ders.lesson6Tasks;

import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int numb= sc.nextInt();
       String result=(numb>=55)?"Pass"
               :"fail";
        System.out.println(result);

    }
}
