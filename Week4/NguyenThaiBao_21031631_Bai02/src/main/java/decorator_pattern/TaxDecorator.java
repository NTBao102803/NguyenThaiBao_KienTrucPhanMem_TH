package decorator_pattern;

public abstract class TaxDecorator extends BasicProduct {
    protected BasicProduct product;

    public TaxDecorator(BasicProduct product) {
        super(product.getDescription(), product.getPrice());
        this.product = product;
    }

    public abstract String getDescription();
}