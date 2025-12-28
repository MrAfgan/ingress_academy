package lesson27tasks.task2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static lesson27tasks.task2.InventoryService.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Product> inventory = new HashMap<>();
        Product camel = new Product("Camel", 4.5, 10);
        inventory.put("1000", camel);
        addProduct(inventory, "1001", new Product("West", 4.0, 10));
        addProduct(inventory, "1002", new Product("Marlboro", 7.0, 10));
        addProduct(inventory, "1003", new Product("Kent", 6.0, 10));
        addProduct(inventory, "1004", new Product("Astra", 1.5, 1));
        updateQuantity(inventory, "1000", 15);

        List<Product> lowStock=InventoryService.displayLowStock(inventory,5);
        for (Product p:lowStock){
            System.out.println("Low stock products :"+p.getName());
        }
    }


}
