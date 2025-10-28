package coffeeShop;

public class Sweet extends Product{
    int calories;

    @Override
    public String toString() {
        return "Sweet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +" AZN"+
                ", description='" + description + '\'' +
                ", total calories: " + calories +
                '}';
    }

    public Sweet(int id, String name, String description, double price, int calories) {
        super(id, name, description, price);
        this.calories = calories;

    }
}
