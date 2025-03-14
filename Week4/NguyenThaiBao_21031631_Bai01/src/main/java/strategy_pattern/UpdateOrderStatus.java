package strategy_pattern;

public class UpdateOrderStatus implements OrderBehavior {
    @Override
    public void execute() {
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
    }
}
