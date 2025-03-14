package decorator_pattern;

public class ProcessingFeeDecorator extends PaymentDecorator {
    private double fee;

    public ProcessingFeeDecorator(PaymentStrategy paymentStrategy, double fee) {
        super(paymentStrategy);
        this.fee = fee;
    }

    @Override
    public void pay(double amount) {
        double totalAmount = amount + fee;
        paymentStrategy.pay(totalAmount);
        System.out.println("Phí xử lý: " + fee);
    }
}
