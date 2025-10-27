package gptChapter3;

import java.util.Arrays;

public class Str3 {
    public static void main(String[] args) {
        String s= "Java";
        String s1= "Java";
        String s2= new String("Java");
        String s3= new String("Java");
        String s4 = new String("java");
        String b="Banana";
        String b1="banana";
        String a="Apple";
        String j="Hello Java Java";
        String d="dog,cat,bird";
        String e=j.replace("Java","Python");
        String[] f=d.split(",");
        String g=a.concat(b);

        System.out.println(s==s1);
        System.out.println(s.equals(s1));
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));
        System.out.println(s==s4);
        System.out.println(s.equals(s4));
        System.out.println(s.equalsIgnoreCase(s4));
        System.out.println(a.compareTo(b));
        System.out.println(b.compareToIgnoreCase(b1));
        System.out.println(b.compareTo(b1));
        System.out.println(j.replace("Java","Python"));
        System.out.println(e);
        System.out.println(j);
        System.out.println(Arrays.toString(f));
        System.out.println(g);


    }
}
