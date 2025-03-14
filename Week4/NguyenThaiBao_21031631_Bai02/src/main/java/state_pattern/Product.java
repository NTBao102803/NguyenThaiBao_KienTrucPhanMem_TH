package state_pattern;

public class Product {
    private String name;
    private double price;
    private TaxState state;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.state = new NotTaxedState(); // Trạng thái khởi tạo
    }

    public void setState(TaxState state) {
        this.state = state;
    }

    public void calculateTax() {
        state.calculateTax(this);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
