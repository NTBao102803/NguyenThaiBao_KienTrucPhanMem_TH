package state_pattern;

public class CanceledOrderState implements OrderState{
    @Override
    public void handleOrder(Order order) {
        System.out.println("Hủy đơn hàng và hoàn tiền.");
    }
}
