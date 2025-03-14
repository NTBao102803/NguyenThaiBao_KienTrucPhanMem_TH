package state_pattern;

public class Order {
    private OrderState state;

    public Order() {
        this.state = new NewOrderState(); // Trạng thái khởi tạo
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void handleOrder() {
        state.handleOrder(this);
    }

    public void cancelOrder() {
        setState(new CanceledOrderState());
        handleOrder(); // Gọi phương thức xử lý đơn hàng sau khi chuyển sang trạng thái hủy
    }
}
