package bank.service;

import static bank.db.Operations.balance;

public class ConcreteBalanceService extends BalanceService {
    @Override
    public void showBalance() {
        System.out.println("Balans: " + balance + " AZN");
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        addHistory("+" + amount + " AZN balansa elave olundu.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            addHistory("-" + amount + " AZN balansdan çıxarıldı");
        } else {
            System.out.println("Balans kifayət etmir");
            addHistory("Ugursuz cixaris cehdi: " + amount + " AZN");
        }
    }
}
