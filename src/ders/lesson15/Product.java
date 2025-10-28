package ders.lesson15;

public class Product {
    String name;
    double price;
    int quantity;
    Product(String name,int quantity,double price){
        this.name=name;
        this.quantity=quantity;
        this.price =price;


    }

    @Override
    public String toString() {
        return "(Product:"+ name +
                ", Price:" + price +"$"+
                ", quantity:" + quantity+"-pcs)";
    }
}
