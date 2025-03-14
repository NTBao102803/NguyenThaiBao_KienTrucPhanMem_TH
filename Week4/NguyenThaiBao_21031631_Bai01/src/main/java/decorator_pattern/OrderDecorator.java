package decorator_pattern;

public abstract class OrderDecorator extends BasicOrder {
    protected BasicOrder order;

    public OrderDecorator(BasicOrder order) {
        this.order = order;
    }

    public abstract String getDescription();
}

