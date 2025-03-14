package decorator_pattern;

public class Test {
    public static void main(String[] args) {
        // Kiểm tra Decorator Pattern
        System.out.println("\n=== Kiểm tra Decorator Pattern ===");
        BasicOrder basicOrder = new BasicOrder();

        // Thêm gói quà
        BasicOrder giftWrappedOrder = new GiftWrapDecorator(basicOrder);
        System.out.println(giftWrappedOrder.getDescription()); // Đơn hàng cơ bản, được gói quà

        // Thêm giao hàng nhanh
        BasicOrder expressOrder = new ExpressShippingDecorator(giftWrappedOrder);
        System.out.println(expressOrder.getDescription()); // Đơn hàng cơ bản, được gói quà, giao hàng nhanh

        // Thêm cả hai decorator
        BasicOrder decoratedOrder = new GiftWrapDecorator(new ExpressShippingDecorator(basicOrder));
        System.out.println(decoratedOrder.getDescription()); // Đơn hàng cơ bản, được gói quà, giao hàng nhanh

        // Thêm một decorator khác (giả sử có một decorator cho bảo hiểm)
        BasicOrder insuredOrder = new InsuranceDecorator(decoratedOrder);
        System.out.println(insuredOrder.getDescription()); // Đơn hàng cơ bản, được gói quà, giao hàng nhanh, có bảo hiểm
    }
}
