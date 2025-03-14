package strategy_pattern;

public class CancelOrder implements OrderBehavior {
    @Override
    public void execute() {
        System.out.println("Hủy đơn hàng và hoàn tiền.");
    }
}
