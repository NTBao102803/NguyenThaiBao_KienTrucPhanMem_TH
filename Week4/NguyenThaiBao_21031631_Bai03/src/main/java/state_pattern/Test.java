package state_pattern;

public class Test {
    public static void main(String[] args) {
        // Kiểm tra State Pattern
        System.out.println("=== Kiểm tra State Pattern ===");
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.processPayment(); // Giao dịch đang chờ xử lý
        paymentContext.processPayment(); // Giao dịch đang được xử lý
        paymentContext.processPayment(); // Giao dịch đã hoàn tất
    }
}
