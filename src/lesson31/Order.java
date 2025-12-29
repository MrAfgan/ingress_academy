package lesson31;

public class Order {
    private String name;
    private double price ;
    private int count;
    private int size;
    private OrderStatus status;
    private User user;

    public Order(User user, String name, double price, int count, int size, OrderStatus status) {
        this.user = user;
        this.name = name;
        this.price = price;
        this.count = count;
        this.size = size;
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
