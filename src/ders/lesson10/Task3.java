package ders.lesson10;

public class Task3 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(20);
        sb.append("Programming");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append(" is fun");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}
