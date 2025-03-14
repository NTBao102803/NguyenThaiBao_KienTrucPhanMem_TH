package decorator_pattern;

public class ExpressShippingDecorator extends OrderDecorator {
    public ExpressShippingDecorator(BasicOrder order) {
        super(order);
    }

    @Override
    public String getDescription() {
        return order.getDescription() + ", giao hàng nhanh";
    }
}

