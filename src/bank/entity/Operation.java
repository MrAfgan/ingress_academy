package bank.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Operation {
    private String type;
    private double amount;
    private String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));

    public Operation(String type, double amount, String time) {
        this.type = type;
        this.amount = amount;
        this.time = time;
    }

    @Override
    public String toString() {
        return "( Operation type: " + type + '\'' +
                ", amount: " + amount +
                ", Operation Time: " + time + '\'' + " )";
    }
}
