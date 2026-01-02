package lesson31;

public class Order {
    private String productName;
    private double price ;
    private int count;
    private int size;
    private OrderStatus status;
    private User user;
    private String errorMessage;



    public Order(User user,
                 String productName,
                 double price,
                 int size,
                 int count,
                 OrderStatus status) {
        this.user = user;
        this.productName = productName;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
