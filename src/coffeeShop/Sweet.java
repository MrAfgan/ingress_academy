package coffeeShop;

public class Sweet extends Product {


    public Sweet(int id, String name, double price, String description) {
        super(id, name, price, description);

    }


    @Override
    public String toString() {
        return getName()+" - "+getPrice()+" Azn";
    }
}
