package abstrakt;

abstract class PaymentProcessor {
    abstract void pay(double amount);
    void validate(double amount){
        if (amount<=0){
            throw new IllegalArgumentException("Invalid amount");
        }
    }
}
