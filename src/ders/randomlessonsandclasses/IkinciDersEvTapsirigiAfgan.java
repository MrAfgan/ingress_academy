package ders.randomlessonsandclasses;

import java.time.LocalDate;
import java.util.Scanner;

public class IkinciDersEvTapsirigiAfgan {
    public static void main(String[] args) {
        String ad = "Efqan";
        String soyad = "Memmedov";
        int thisYear = LocalDate.now().getYear();
        int myBirthYear = 1987;
        int myAge = thisYear - myBirthYear;
        System.out.println("Salam menim ad ve soyadim " + ad + " " + soyad + ", yasim ise " + myAge + " yasim var.");
        Scanner input = new Scanner(System.in);
        System.out.println("Bes sizin adiniz nedir?");
        String name = input.nextLine();
        System.out.println("Bes dogum iliniz necenci ildir?");
        int bornYear = input.nextInt();
        int yourAge = thisYear - bornYear;
        int ourAgeDifference = yourAge - myAge;
        if (ourAgeDifference > 0) {
            System.out.println("tanis olmagima sad oldum " + name + " sizin yasiniz " + yourAge + "-dir. Siz menden " + ourAgeDifference + " yas boyuksunuz!");

        } else if (ourAgeDifference == 0) {
            System.out.println("Tanis olmagima sad oldum " + name + " sizin yasiniz " + yourAge + "-dir. Biz yasidiq.");
        } else
            System.out.println("Tanis olmagima sad oldum " + name + ", sizin yasiniz " + yourAge + "-dir. Siz menden " + Math.abs(ourAgeDifference) + " yas kiciksiniz.");
    }

}

