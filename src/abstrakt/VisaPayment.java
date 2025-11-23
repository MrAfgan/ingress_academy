package abstrakt;

public class VisaPayment extends PaymentProcessor{
    @Override
    void pay(double amount) {
        validate(amount);
        System.out.println("Payment via VISA: " +amount);
    }
}
