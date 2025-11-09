package coffeeShop;

public class Coffee extends Product {

    Coffee(int id, String name, double price, String description) {
        super(id, name, price, description);
    }

    @Override
    public String toString() {
        return getName() +" - "+ getPrice()+"Azn.";
    }
}
