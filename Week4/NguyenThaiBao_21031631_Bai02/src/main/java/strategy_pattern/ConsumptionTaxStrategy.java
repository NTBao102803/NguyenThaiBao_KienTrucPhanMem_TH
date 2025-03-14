package strategy_pattern;

public class ConsumptionTaxStrategy implements TaxStrategy {
    private static final double CONSUMPTION_TAX_RATE = 0.1; // 10%

    @Override
    public double calculateTax(Product product) {
        return product.getPrice() * CONSUMPTION_TAX_RATE;
    }
}
