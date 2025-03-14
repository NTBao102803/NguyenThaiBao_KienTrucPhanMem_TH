package state_pattern;

public class NotTaxedState implements TaxState {
    @Override
    public void calculateTax(Product product) {
        System.out.println("Sản phẩm chưa tính thuế.");
    }
}
