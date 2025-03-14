package strategy_pattern;

public class LuxuryTaxStrategy implements TaxStrategy {
    private static final double LUXURY_TAX_RATE = 0.3; // 30%

    @Override
    public double calculateTax(Product product) {
        return product.getPrice() * LUXURY_TAX_RATE;
    }
}
