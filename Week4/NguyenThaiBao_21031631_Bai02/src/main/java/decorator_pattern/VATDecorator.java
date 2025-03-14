package decorator_pattern;

public class VATDecorator extends TaxDecorator {
    private double tax;

    public VATDecorator(BasicProduct product, double tax) {
        super(product);
        this.tax = tax;
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", VAT: " + tax;
    }
}
