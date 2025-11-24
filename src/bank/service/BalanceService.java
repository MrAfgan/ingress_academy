package bank.service;

import static bank.db.Operations.*;

public class BalanceService {
    public void showBalance() {
        System.out.println("Balans: " + balance + " AZN");
    }

    public void deposit(double amount) {
        balance += amount;
        addHistory("+" + amount + " AZN balansa elave olundu.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            addHistory("-" + amount + " AZN balansdan çıxarıldı");
        } else {
            System.out.println("Balans kifayət etmir");
            addHistory("Ugursuz cixaris cehdi: " + amount + " AZN");
        }
    }

    public void addHistory(String text) {
        operationHistory[indexPointer] = text;
        indexPointer = (indexPointer + 1) % operationHistory.length;
    }

    public void showHistory() {
        System.out.println("=== Əməliyyat tarixçəsi ===");
        boolean Empty = true;
        for (String oph : operationHistory) {
            if (oph != null) {
                System.out.println(oph);
                Empty = false;
            }
            if (Empty) {
                System.out.println("Emeliyyat tarixcesi bosdur");
            }
        }
    }
}

