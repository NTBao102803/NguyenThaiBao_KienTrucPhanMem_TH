package decorator_pattern;

public class GiftWrapDecorator extends OrderDecorator {
    public GiftWrapDecorator(BasicOrder order) {
        super(order);
    }

    @Override
    public String getDescription() {
        return order.getDescription() + ", được gói quà";
    }
}

