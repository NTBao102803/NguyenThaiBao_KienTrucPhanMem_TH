package strategy_pattern;

public class Test {
    public static void main(String[] args) {
        // Kiểm tra Strategy Pattern
        System.out.println("\n=== Kiểm tra Strategy Pattern ===");
        Product product = new Product("Sản phẩm B", 200.0);

        TaxStrategy consumptionTaxStrategy = new ConsumptionTaxStrategy();
        double consumptionTax = consumptionTaxStrategy.calculateTax(product);
        System.out.println("Thuế tiêu thụ cho " + product.getName() + ": " + consumptionTax);

        TaxStrategy vatStrategy = new VATStrategy();
        double vat = vatStrategy.calculateTax(product);
        System.out.println("VAT cho " + product.getName() + ": " + vat);

        TaxStrategy luxuryTaxStrategy = new LuxuryTaxStrategy();
        double luxuryTax = luxuryTaxStrategy.calculateTax(product);
        System.out.println("Thuế xa xỉ cho " + product.getName() + ": " + luxuryTax);
    }
}
