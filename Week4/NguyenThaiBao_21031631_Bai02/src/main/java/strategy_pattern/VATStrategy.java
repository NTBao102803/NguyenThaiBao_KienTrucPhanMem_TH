package strategy_pattern;

public class VATStrategy implements TaxStrategy {
    private static final double VAT_RATE = 0.2; // 20%

    @Override
    public double calculateTax(Product product) {
        return product.getPrice() * VAT_RATE;
    }
}