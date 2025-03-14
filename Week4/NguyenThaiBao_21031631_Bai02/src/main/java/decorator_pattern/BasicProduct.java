package decorator_pattern;

public class BasicProduct {
    private String name;
    private double price;

    public BasicProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getDescription() {
        return name + " - Giá: " + price;
    }

    public double getPrice() {
        return price;
    }
}
