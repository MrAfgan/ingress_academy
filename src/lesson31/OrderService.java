package lesson31;

public class OrderService {
    public static void orderValidate(Order order)
            throws InvalidSizeException,
            InvalidCountException,
            InsufficientBalanceException {
        if (order.getSize() > 2) {
            throw new InvalidSizeException("Too big size:" + order.getSize());
        }
        if (order.getCount() > 5 || order.getCount() <= 0) {
            throw new InvalidCountException("Count lower or higher than limit: " + order.getCount());
        }
        double totalPrice = order.getPrice() * order.getCount();
        if (order.getUser().getBalance() < totalPrice) {
            throw new InsufficientBalanceException("Insufficient balance.Required: "+totalPrice+
                    "Available" +order.getUser().getBalance());
        }
    }
}
