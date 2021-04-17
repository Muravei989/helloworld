package entity;

public class Trusy {
    private final String color;
    private final int price;

    public Trusy(String color, int price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Trusy{" +
                "color='" + color + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
