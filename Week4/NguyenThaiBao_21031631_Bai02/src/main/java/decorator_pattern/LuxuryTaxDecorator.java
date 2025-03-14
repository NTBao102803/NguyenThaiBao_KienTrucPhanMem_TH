package decorator_pattern;

public class LuxuryTaxDecorator extends TaxDecorator {
    private double tax;

    public LuxuryTaxDecorator(BasicProduct product, double tax) {
        super(product);
        this.tax = tax;
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", Thuế xa xỉ: " + tax;
    }
}