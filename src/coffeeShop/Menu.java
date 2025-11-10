package coffeeShop;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Product> products = new ArrayList<>();

    public Menu() {

        Coffee Espresso = new Coffee(1, "Espresso", 3.0, "Tünd və qatı qəhvə");
        Coffee Americano = new Coffee(2, "Americano", 3.5, "Tünd qəhvə");
        Coffee Latte = new Coffee(3, "Latte", 4.0, "Süd və qəhvə qarışığı, yüngül dad");
        Coffee Cappuccino = new Coffee(4, "Cappuccino", 4.5, "Süd və bol köpüklü qəhvə");
        Sweet Donut = new Sweet(5, "Donut", 2.5, "Yağlı şirin kökə");
        Sweet Croissant = new Sweet(6, "Croissant", 3.0, "Qat-qat fransız bulkası");
        Sweet Brownie = new Sweet(7, "Brownie", 5.0, "İçərisi bol şokoladlı qəhvəli şirniyyat");
        Sweet Cheesecake = new Sweet(8, "Cheesecake", 6.0, "Yumuşaq zərif keks");
        products.add(Espresso);
        products.add(Americano);
        products.add(Latte);
        products.add(Cappuccino);
        products.add(Donut);
        products.add(Croissant);
        products.add(Brownie);
        products.add(Cheesecake);
    }

    public void printMenu() {
        System.out.println("---MENU---");
        for (Product productList : products) {
            System.out.println(productList.getId() + ". " + productList);
        }

    }

    public Product getProductById(int id) {
        for (Product getById : products) {
            if (getById.getId() == id) {
                return getById;
            }
        }

        return null;
    }
}

