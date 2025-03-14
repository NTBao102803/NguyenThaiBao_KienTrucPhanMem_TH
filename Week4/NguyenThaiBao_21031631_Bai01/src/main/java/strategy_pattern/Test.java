package strategy_pattern;

public class Test {
    public static void main(String[] args) {
        // Kiểm tra Strategy Pattern
        System.out.println("\n=== Kiểm tra Strategy Pattern ===");
        OrderWithStrategy orderWithStrategy = new OrderWithStrategy();

        // Hành vi cho trạng thái "Mới tạo"
        orderWithStrategy.setBehavior(new CheckOrderInfo());
        orderWithStrategy.executeBehavior(); // Kiểm tra thông tin đơn hàng

        // Hành vi cho trạng thái "Đang xử lý"
        orderWithStrategy.setBehavior(new PackageAndShip());
        orderWithStrategy.executeBehavior(); // Đóng gói và vận chuyển

        // Hành vi cho trạng thái "Đã giao"
        orderWithStrategy.setBehavior(new UpdateOrderStatus());
        orderWithStrategy.executeBehavior(); // Cập nhật trạng thái đơn hàng là đã giao

        // Hành vi cho trạng thái "Hủy"
        orderWithStrategy.setBehavior(new CancelOrder());
        orderWithStrategy.executeBehavior(); // Hủy đơn hàng và hoàn tiền
    }
}
