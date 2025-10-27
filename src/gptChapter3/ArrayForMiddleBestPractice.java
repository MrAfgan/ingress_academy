package gptChapter3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayForMiddleBestPractice {
    public static void main(String[] args) {
        System.out.println("5eded");
        int [] arrays= new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++)
            arrays[i]= sc.nextInt();
        System.out.println(Arrays.toString(arrays));
        for (int i = arrays.length-1; i >=0 ; i--) {
            System.out.println(arrays[i]+" ");

        }
        }

    }

