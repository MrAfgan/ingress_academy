package ders.lesson8;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        System.out.println("-----------");
        System.out.println("Kalkulyator");
        System.out.println("-----------");
        System.out.println();
        Scanner sp = new Scanner(System.in);
        System.out.println("Ededi daxil edin");
        int birinci = sp.nextInt();
        System.out.println("Riyazi emeliyyatini daxil edin:");
        String emeliyyat = sp.next();
        System.out.println("Ikinci ededi daxil edin:");
        int ikinci = sp.nextInt();
        if (emeliyyat.equals("+")) {
            System.out.println("Cavab:" + (birinci + ikinci));

        } else if (emeliyyat.equals("-")) {
            System.out.println("Cavab:" + (birinci - ikinci));

        } else if (emeliyyat.equals("*")) {
            System.out.println("Cavab:" + (birinci * ikinci));


        } else if (emeliyyat.equals("/")) {
            System.out.println("Cavab:" + (birinci / ikinci));

        }
    }
}
