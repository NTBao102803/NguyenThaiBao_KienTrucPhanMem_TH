package state_pattern;

public class ProcessingOrderState implements OrderState {
    @Override
    public void handleOrder(Order order) {
        System.out.println("Đóng gói và vận chuyển.");
        order.setState(new DeliveredOrderState());
    }
}
