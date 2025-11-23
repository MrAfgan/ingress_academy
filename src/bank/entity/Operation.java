package bank.entity;

public class Operation {
    private String type;
    private double amount;
    private String time;

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
