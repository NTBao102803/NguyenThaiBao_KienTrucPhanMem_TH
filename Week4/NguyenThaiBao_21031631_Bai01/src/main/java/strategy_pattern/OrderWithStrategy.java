package strategy_pattern;

public class OrderWithStrategy {
    private OrderBehavior behavior;

    public void setBehavior(OrderBehavior behavior) {
        this.behavior = behavior;
    }

    public void executeBehavior() {
        behavior.execute();
    }
}
