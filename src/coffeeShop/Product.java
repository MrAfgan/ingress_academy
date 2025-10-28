package coffeeShop;

public abstract class Product {
    protected int id;
    protected String name;
    protected double price;
    protected String description;


      Product(int id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    String getDescription() {
        return description;
    }

    void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description: '" + description + '\'' +
                ", price=" + price +" AZN"+
                '}';
    }
}
