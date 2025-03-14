package state_pattern;

public class TaxedState implements TaxState {
    @Override
    public void calculateTax(Product product) {
        System.out.println("Sản phẩm đã tính thuế.");
    }
}
