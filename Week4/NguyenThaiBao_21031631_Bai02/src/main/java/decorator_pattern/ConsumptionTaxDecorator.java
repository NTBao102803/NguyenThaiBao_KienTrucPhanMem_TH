package decorator_pattern;

public class ConsumptionTaxDecorator extends TaxDecorator {
    private double tax;

    public ConsumptionTaxDecorator(BasicProduct product, double tax) {
        super(product);
        this.tax = tax;
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", Thuế tiêu thụ: " + tax;
    }
}
