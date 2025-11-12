package coffeeShop;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int tableNumber;
    private List<Product>orderedProducts;

    public Order(int tableNumber) {
        this.tableNumber = tableNumber;
        orderedProducts=new ArrayList<>();

    }
    public boolean hasOrders(){
        return !orderedProducts.isEmpty();
    }
    public void addProduct(Product p){
        orderedProducts.add(p);

    }
    public double calculateTotal(){
        double totalPrice=0;
        for (Product p:orderedProducts){
            totalPrice+=p.getPrice();
        }
        return totalPrice;
    }
    public void printOrder(){
        System.out.println("Masa "+tableNumber+" üçün sifarişlər:");
        for (Product p : orderedProducts) {
            System.out.println("- " + p);
        }
        System.out.println("Yekun qiymət: " + calculateTotal() + " Azn");
    }
    public void clearOrder(){
        orderedProducts.clear();
    }

}
