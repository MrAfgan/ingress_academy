package ders.lesson6;

public class GptTask3 {
    public static void main(String[] args) {
        int total = 1024;

        for (int i = total; i>=4; i/=2) {
            total/=2;
            System.out.println(total);
        }

    }

}