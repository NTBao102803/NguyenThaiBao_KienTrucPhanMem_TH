package strategy_pattern;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng PayPal: " + amount);
    }
}

