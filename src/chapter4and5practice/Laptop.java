package chapter4and5practice;

public class Laptop {
    String brand;
    int ram;
    double price;

    public Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public Laptop() {
        this("HP", 8, 1399.99);
    }
    public Laptop(String name,double price){
        this(name,8,price);
    }
    public  Laptop(int ram,double price){
        this("HP",ram,price);
    }
}
