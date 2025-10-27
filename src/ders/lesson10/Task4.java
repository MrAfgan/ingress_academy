package ders.lesson10;

public class Task4 {
    public static void main(String[] args) {
        String s = new String("");
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <=1000 ; i++) {
            s=s.concat(String.valueOf(i));
            System.out.println(s);

        }
        for (int i = 1; i <= 1000; i++) {
            sb.append(i);

        }
        System.out.println(sb);
        System.currentTimeMillis();
    }
}
