package ders.lesson15;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String, Product> mobileParts = new HashMap<>();
        Product iphone17Battery = new Product("Iphone 17 Battery", 8, 78.0);
        Product usbTypeCForIphone = new Product("Original Apple Lightning cable", 30, 29.99);
        Product originalMagSafePowerBank = new Product("Original Iphone powerbank", 4, 99.0);
        Product airPodsPro3 = new Product("Airpods Pro 3", 3, 240.0);
        mobileParts.put("101", iphone17Battery);
        mobileParts.put("105", usbTypeCForIphone);
        mobileParts.putIfAbsent("106", originalMagSafePowerBank);
        mobileParts.putIfAbsent("100", airPodsPro3);
        System.out.println(mobileParts);
        System.out.println();
        updateStock(mobileParts, "100", 2, 230.0);
        addStock(mobileParts, "107", "120w charger", 10, 45.0);
        addStock(mobileParts, "107", "Magnet Holder", 5, 20.0);
    }

    public static void addStock(Map<String, Product> mobileParts, String id, String name, int quantity, double price) {
        if (mobileParts.containsKey(id)) {
            System.out.println("This: " + id + " id is already exist by Product:" + mobileParts.get(id).name + ",try bind new product to different id...");
        } else {
            Product p = new Product(name, quantity, price);
            mobileParts.put(id, p);
            System.out.println("[" + id + "- " + p.name + "] successfully added to stock");
            System.out.println();
            if (p.quantity < 2) {
                System.out.println("Low quantity on " + p.name + ".Quantity=" + p.quantity);
            }
        }
    }

    public static void updateStock(Map<String, Product> mobileParts, String id, int newQuantity, double newPrice) {
        if (mobileParts.containsKey(id)) {
            Product p = mobileParts.get(id);
            p.quantity = newQuantity;
            p.price = newPrice;
            System.out.println(p + " updated...");
            System.out.println();

            if (p.quantity < 2) {
                System.out.println("Low quantity on " + p.name + ".Quantity=" + p.quantity);
            }
        } else {
            System.out.println("Product not found!");
        }
    }
}

