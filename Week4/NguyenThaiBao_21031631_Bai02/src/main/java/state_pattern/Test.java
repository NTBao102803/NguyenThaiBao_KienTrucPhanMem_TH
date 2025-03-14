package state_pattern;

public class Test {
    public static void main(String[] args) {
        // Kiểm tra State Pattern
        System.out.println("=== Kiểm tra State Pattern ===");
        Product product = new Product("Sản phẩm A", 100.0);
        product.calculateTax(); // Sản phẩm chưa tính thuế
        product.setState(new TaxedState());
        product.calculateTax(); // Sản phẩm đã tính thuế
    }
}
