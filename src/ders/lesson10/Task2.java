package ders.lesson10;

public class Task2 {
    public static void main(String[] args) {
        String st= "Java";
        StringBuilder sb=new StringBuilder("Java");
        sb.replace(0,1,"Y");
        st.replace("J","Y");
        String ss=new String(st.replace("J","Y"));
        System.out.println(st);
        System.out.println(sb);
        System.out.println(ss);
    }
}
