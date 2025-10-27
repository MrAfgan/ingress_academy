//package ders.lesson11;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Task1 {
//    public static void main(String[] args) {
//        int score = stage1();
//        System.out.println("senin xalin=" + score);
//    }
//
//
//    public static int stage1() {
//        Scanner sc = new Scanner(System.in);
//        Random r = new Random();
//        int point = 0;
//        int secretnum = r.nextInt(5) + 1;
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("Texmin ededini yaz");
//            int findnum = sc.nextInt();
//            if (findnum == secretnum) {
//                if (i == 1) point = 100;
//                else if (i==2) point=70;
//                else  point=50;
//                break;
//
//            }
//
//        }return point;
//
//    }
//    public static int stage2(){
//        Random r=new Random();
//        Scanner sc=new Scanner(System.in);
//        int score=0;
//        boolean[] used=new boolean[4];
//        for (int i = 0; i < 4; i++) {
//            System.out.println("emeliyyati sec: (+) (-) (*) (/)");
//            String oper= sc.next();
//            if (!(oper.equals("+")) && oper.equals("-") && oper.equals("*") && oper.equals("/")) {
//                i--;
////                return;
//            }
//
//             else if (oper.equals("+")) {
//
//            }
//             else if (oper.equals("-")) {
//
//            } else if (oper.equals("*")) {
//
////            } else x=a /b;
//
//        }
//
//
//        return score;
//    }
////}