package abstrakt;

public class PayPalPayment extends PaymentProcessor{
    @Override
    void pay(double amount) {
        validate(amount);
        System.out.println("Payment via PayPal "+amount);
    }
}
