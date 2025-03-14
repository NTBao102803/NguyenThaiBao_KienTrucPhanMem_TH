package state_pattern;

public class CompletedState implements PaymentState {
    @Override
    public void processPayment(PaymentContext context) {
        System.out.println("Giao dịch đã hoàn tất.");
    }
}
