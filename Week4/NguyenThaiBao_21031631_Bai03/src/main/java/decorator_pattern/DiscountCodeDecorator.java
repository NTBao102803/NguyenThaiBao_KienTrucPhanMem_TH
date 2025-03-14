package decorator_pattern;

public class DiscountCodeDecorator extends PaymentDecorator {
    private double discount;

    public DiscountCodeDecorator(PaymentStrategy paymentStrategy, double discount) {
        super(paymentStrategy);
        this.discount = discount;
    }

    @Override
    public void pay(double amount) {
        double totalAmount = amount - discount;
        paymentStrategy.pay(totalAmount);
        System.out.println("Mã giảm giá: " + discount);
    }
}
