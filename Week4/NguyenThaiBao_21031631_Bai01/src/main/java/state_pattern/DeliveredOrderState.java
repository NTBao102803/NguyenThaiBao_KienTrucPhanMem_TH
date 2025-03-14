package state_pattern;

public class DeliveredOrderState implements OrderState{
    @Override
    public void handleOrder(Order order) {
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
    }
}
