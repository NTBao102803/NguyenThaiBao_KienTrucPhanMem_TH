package strategy_pattern;

public class Product {
    private String name;
    private double price;
    private TaxStrategy taxStrategy; // Chiến lược thuế

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double calculateTax() {
        if (taxStrategy != null) {
            return taxStrategy.calculateTax(this);
        } else {
            throw new IllegalStateException("Chiến lược thuế chưa được thiết lập.");
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
