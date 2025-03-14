package decorator_pattern;

public class Test {
    public static void main(String[] args) {
        // Kiểm tra Decorator Pattern
        System.out.println("\n=== Kiểm tra Decorator Pattern ===");

        // Tạo sản phẩm cơ bản
        BasicProduct basicProduct = new BasicProduct("Sản phẩm C", 300.0);

        // Tính thuế tiêu thụ
        double consumptionTax = 30.0; // Giả sử thuế tiêu thụ là 10% của giá
        BasicProduct productWithConsumptionTax = new ConsumptionTaxDecorator(basicProduct, consumptionTax);
        System.out.println(productWithConsumptionTax.getDescription()); // Mô tả sản phẩm với thuế tiêu thụ

        // Tính VAT
        double vat = 60.0; // Giả sử VAT là 20% của giá
        BasicProduct productWithVAT = new VATDecorator(basicProduct, vat);
        System.out.println(productWithVAT.getDescription()); // Mô tả sản phẩm với VAT

        // Tính thuế xa xỉ
        double luxuryTax = 90.0; // Giả sử thuế xa xỉ là 30% của giá
        BasicProduct productWithLuxuryTax = new LuxuryTaxDecorator(basicProduct, luxuryTax);
        System.out.println(productWithLuxuryTax.getDescription()); // Mô tả sản phẩm với thuế xa xỉ

        // Kết hợp các decorator
        BasicProduct fullyDecoratedProduct = new LuxuryTaxDecorator(
                new VATDecorator(
                        new ConsumptionTaxDecorator(basicProduct, consumptionTax),
                        vat
                ),
                luxuryTax
        );
        System.out.println(fullyDecoratedProduct.getDescription()); // Mô tả sản phẩm với tất cả các loại thuế
    }
}
