package ders.lesson6;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        String username;
        String password;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter correct username then password");
        username = sc.next();
        password = sc.next();
        if (username.equalsIgnoreCase("Admin") && password.equals("1234")) System.out.println("Login successful");
        else if (!username.equalsIgnoreCase("Admin") && !password.equals("1234")) System.out.println("Username and password wrong!");
        else System.out.println("Login or password wrong");
        }
    }