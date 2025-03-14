package state_pattern;

public class PaymentContext {
    private PaymentState state;

    public PaymentContext() {
        this.state = new PendingState(); // Trạng thái khởi tạo
    }

    public void setState(PaymentState state) {
        this.state = state;
    }

    public void processPayment() {
        state.processPayment(this);
    }
}
