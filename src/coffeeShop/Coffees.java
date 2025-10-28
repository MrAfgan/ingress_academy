package coffeeShop;

public class Coffees extends Product {
    public Coffees(int id, String name, String description, double price) {
        super(id, name, description, price);
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +" AZN"+
                '}';
    }
}


