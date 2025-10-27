package ders.lesson10;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        sb.append("World");
        sb.insert(5,",");
        String string= sb.toString();
        System.out.println(string);
        System.out.println(sb);
    }
}
