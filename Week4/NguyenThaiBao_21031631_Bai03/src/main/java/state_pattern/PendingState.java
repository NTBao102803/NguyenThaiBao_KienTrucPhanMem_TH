package state_pattern;

public class PendingState implements PaymentState {
    @Override
    public void processPayment(PaymentContext context) {
        System.out.println("Giao dịch đang chờ xử lý.");
        context.setState(new ProcessingState());
    }
}
