package decorator_pattern;

public class InsuranceDecorator extends OrderDecorator {
    public InsuranceDecorator(BasicOrder order) {
        super(order);
    }

    @Override
    public String getDescription() {
        return order.getDescription() + ", có bảo hiểm";
    }
}
