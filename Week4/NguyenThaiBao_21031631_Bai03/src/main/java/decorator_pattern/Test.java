package decorator_pattern;

public class Test {
    public static void main(String[] args) {
        // Kiểm tra Decorator Pattern
        System.out.println("\n=== Kiểm tra Decorator Pattern ===");

        // Tạo phương thức thanh toán bằng thẻ tín dụng
        PaymentStrategy creditCardPayment = new CreditCardPayment();

        // Thanh toán bằng thẻ tín dụng với phí xử lý
        PaymentStrategy creditCardWithFee = new ProcessingFeeDecorator(creditCardPayment, 5.0);
        creditCardWithFee.pay(100.0); // Thanh toán 100.0 với phí xử lý

        // Thanh toán bằng PayPal với mã giảm giá
        PaymentStrategy payPalPayment = new PayPalPayment();
        PaymentStrategy payPalWithDiscount = new DiscountCodeDecorator(payPalPayment, 10.0);
        payPalWithDiscount.pay(200.0); // Thanh toán 200.0 với mã giảm giá

        // Kết hợp cả phí xử lý và mã giảm giá
        PaymentStrategy combinedPayment = new DiscountCodeDecorator(
                new ProcessingFeeDecorator(creditCardPayment, 5.0),
                10.0
        );
        combinedPayment.pay(100.0); // Thanh toán 100.0 với phí xử lý và mã giảm giá
    }
}
