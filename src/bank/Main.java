package bank;

import bank.service.BalanceService;
import bank.service.ConcreteBalanceService;
import bank.service.UserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserService userService = new UserService();
        BalanceService balanceService = new ConcreteBalanceService();

        while (true) {
            System.out.println("Username daxil edin");
            String username = sc.next();
            System.out.println("Password daxil edin");
            String password = sc.next();
            boolean correctLogin = userService.login(username, password);
            if (!correctLogin) {
                System.out.println("Login yaxud parol yalnisdir!");
                continue;
            }
            while (true) {
                System.out.println("""
                        1. Balansı göstər
                        2. Pul əlavə et
                        3. Pul çıxart
                        4. Tarixçəni göstər
                        5. Çıxış
                        Seçim edin:
                        """);
                if (!(sc.hasNextInt())) {
                    System.out.println("Zehmet olmasa yalniz reqem daxil edin!");
                    sc.next();
                    continue;
                }
                int choice = sc.nextInt();
                if (choice < 1 || choice > 5) {
                    System.out.println("Yalnis secim!");
                    continue;
                }
                switch (choice) {
                    case 1:
                        balanceService.showBalance();
                        break;
                    case 2:
                        System.out.println("Depozit meblegini daxil edin");
                        double amount = sc.nextDouble();
                        balanceService.deposit(amount);
                        break;
                    case 3:
                        System.out.println("Mexaric meblegini daxil edin");
                        double amount1 = sc.nextDouble();
                        balanceService.withdraw(amount1);
                        break;
                    case 4:
                        balanceService.showHistory();
                        break;
                    case 5:
                        return;
                }
            }
        }

    }

}

