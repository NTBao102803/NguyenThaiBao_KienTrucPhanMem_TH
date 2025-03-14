package state_pattern;

public class ProcessingState implements PaymentState {
    @Override
    public void processPayment(PaymentContext context) {
        System.out.println("Giao dịch đang được xử lý.");
        context.setState(new CompletedState());
    }
}
