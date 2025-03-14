package state_pattern;

public class Test {
    public static void main(String[] args) {
        // Kiểm tra State Pattern
        System.out.println("=== Kiểm tra State Pattern ===");
        Order order = new Order();
        order.handleOrder(); // Kiểm tra thông tin đơn hàng
        order.handleOrder(); // Đóng gói và vận chuyển
        order.handleOrder(); // Cập nhật trạng thái đơn hàng là đã giao

        // Kiểm tra trạng thái hủy
        System.out.println("\n=== Kiểm tra CanceledOrderState ===");
        order.cancelOrder(); // Hủy đơn hàng
    }
}
