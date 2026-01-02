package lesson31;

public class OrderService {
    public static void orderValidate(Order order)
            throws InvalidSizeException,
            InvalidCountException,
            InsufficientBalanceException {
        if (order.getSize() > 2) {
            throw new InvalidSizeException("Reason:Too big size:" + order.getSize()+" size");
        }
        if (order.getCount() > 5 || order.getCount() <= 0) {
            throw new InvalidCountException("Reason:Count lower or higher than limit: " +
                    order.getCount()+" pcs");
        }
        double totalPrice = order.getPrice() * order.getCount();
        if (order.getUser().getBalance() < totalPrice) {
            throw new InsufficientBalanceException("Insufficient balance.Required: " +
                    totalPrice +" AZN"+
                    ", Available " + order.getUser().getBalance()+" AZN.");
        }
    }
}
