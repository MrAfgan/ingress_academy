package bank.service;

import static bank.db.Operations.*;

public abstract class BalanceService {
    public abstract void showBalance();

    public abstract void deposit(double amount);


    public abstract void withdraw(double amount);

    public void addHistory(String text) {
        if (indexPointer == operationHistory.length) {
            indexPointer = 0;
        }
        operationHistory[indexPointer] = text;
        indexPointer++;
    }

    public void showHistory() {
        System.out.println("=== Əməliyyat tarixçəsi ===");
        boolean isEmpty = true;
        for (String o : operationHistory) {
            if (o != null) {
                System.out.println(o);
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("Emeliyyat tarixcesi bosdur");
        }
    }
}
