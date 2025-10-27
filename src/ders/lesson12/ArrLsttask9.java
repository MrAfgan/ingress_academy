package ders.lesson12;

import java.util.ArrayList;

public class ArrLsttask9 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(7);
        list1.add(3);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(8);
        list2.add(15);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(4);
        list3.add(8);
        list3.add(12);
        list3.add(16);
        matrix.add(list1);
        matrix.add(list2);
        matrix.add(list3);
        for (ArrayList<Integer> one : matrix) {
            for (Integer numb:one){
                System.out.print(numb+" ");
            }
            System.out.println();
//            System.out.print(" " + one + " "); //ya bu varianti saxlayib 2ci for each-i ve plintline silirik ya da bunu silirik.
        }
    }
}
