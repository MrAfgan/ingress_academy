package lesson27tasks.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InventoryService {
    public static boolean addProduct(Map<String, Product> productInventory, String id, Product product) {
        if (productInventory.containsKey(id)) {
            return false;
        }
        productInventory.put(id, product);
        return true;
    }

    public static boolean updateQuantity(Map<String, Product> productInventory, String id, int newQuantity) {
        Product product = productInventory.get(id);
        if (product == null) {
            return false;

        } else {
            product.setQuantity(newQuantity);
            return true;
        }

    }

    public static List<Product> displayLowStock(Map<String, Product> productInventory, int minLevel) {
        List<Product> result = new ArrayList<>();
        for (Product product : productInventory.values()) {
            if (product.getQuantity() < minLevel) {
                result.add(product);
            }


        }
        return result;
    }
}

