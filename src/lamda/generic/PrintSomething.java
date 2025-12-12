package lamda.generic;

public class PrintSomething<T> {
    T type;

    public PrintSomething(T type) {
        this.type = type;
    }

    public void print() {
        System.out.println(type);
    }

    public void setType(T type) {
        this.type = type;
    }

    public T getType() {
        return type;
    }
}
