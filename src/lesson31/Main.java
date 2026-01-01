package lesson31;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();
        User Kanan = new User("Kanan", 50.0);
        User Vahid = new User("Vahid", 100.0);
        User Adil = new User("Adil", 200.0);
        Order order = new Order(Kanan, "ComboMenu", 20.0, 3, 2, OrderStatus.RECEIVED);
        Order order1 = new Order(Kanan, "ComboMenu", 20.0, 2, 2, OrderStatus.RECEIVED);
        Order order2 = new Order(Vahid, "Launch Menu", 55.0, 1, 6, OrderStatus.RECEIVED);
        Order order3 = new Order(Adil, "Kebab Set", 120.0, 1, 2, OrderStatus.RECEIVED);
        orderList.add(order);
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        for (Order allOrders : orderList) {
            try {
                OrderService.orderValidate(allOrders);
                allOrders.setStatus(OrderStatus.PREPARING);
                allOrders.setStatus(OrderStatus.SENT);
                allOrders.setStatus(OrderStatus.DELIVERED);

            } catch (InvalidSizeException
                     | InvalidCountException
                     | InsufficientBalanceException e) {
                allOrders.setStatus(OrderStatus.CANCELLED);
                allOrders.setErrorMessage(e.getMessage());
            } finally {
                System.out.println("User: " +
                        allOrders.getUser().getName() +
                        ", Product: " + allOrders.getProductName() +
                        ", Price: " + allOrders.getPrice() +
                        ", Count: " + allOrders.getCount() +
                        ", Size: " + allOrders.getSize() +
                        ", Order Status: " + allOrders.getStatus());
                if (allOrders.getErrorMessage() != null) {
                    System.out.println("Error: " + allOrders.getErrorMessage());
                }
            }
        }
    }
}
