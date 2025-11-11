package coffeeShop;

import java.util.Scanner;

public class CoffeeShopApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zehmet olamzsa masa nomresini daxil edin");
        int tableNumber = sc.nextInt();
        Menu menu = new Menu();
        Order order = new Order(tableNumber);
        while (true) {
            System.out.println("""
                    ---COFFEE SHOP MENU---
                    1.Sifariş et
                    2. Ümumi hesabı göstər
                    3. Hesab iste
                    4. Çıxış
                    Seçiminizi daxil edin:""");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    while (true) {
                        menu.printMenu();
                        System.out.println();
                        System.out.println("Məhsul ID-sini daxil edin,(0 - geri qayıt).");
                        int choices = sc.nextInt();
                        if (choices == 0) break;
                        Product product = menu.getProductById(choices);
                        if (product == null) {
                            System.out.println("Bu id ile mehsul tapilmadi.");
                        } else {
                            order.addProduct(product);
                            System.out.println(product.getName() + " sifarise elave olundu.");
                        }
                    }
                    break;
                case 2:
                    if (!order.hasOrders()) {
                        System.out.println("Hələ sifariş etməmisiniz");
                    } else order.printOrder();
                    break;
                case 3:
                    if (!order.hasOrders()) {
                        System.out.println("Hələ sifariş etməmisiniz");
                        }else order.printOrder();
                    System.out.println("Tesekkur edirik");
                    order.clearOrder();
                    break;
                case 4:
                    if (!order.hasOrders()) {
                        System.out.println("Xos getdiniz.");
                        }
                    return;
                default:
                    System.out.println("Yalnis secim!");
            }
        }

    }
}
