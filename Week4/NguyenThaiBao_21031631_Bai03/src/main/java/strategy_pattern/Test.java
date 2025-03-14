package strategy_pattern;

public class Test {
    public static void main(String[] args) {
        // Kiểm tra Strategy Pattern
        System.out.println("\n=== Kiểm tra Strategy Pattern ===");
        PaymentStrategy creditCardPayment = new CreditCardPayment();
        creditCardPayment.pay(100.0); // Thanh toán bằng thẻ tín dụng

        PaymentStrategy payPalPayment = new PayPalPayment();
        payPalPayment.pay(200.0); // Thanh toán bằng PayPal
    }
}
