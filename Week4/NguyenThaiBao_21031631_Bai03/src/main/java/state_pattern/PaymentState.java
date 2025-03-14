package state_pattern;

public interface PaymentState {
    void processPayment(PaymentContext context);
}
