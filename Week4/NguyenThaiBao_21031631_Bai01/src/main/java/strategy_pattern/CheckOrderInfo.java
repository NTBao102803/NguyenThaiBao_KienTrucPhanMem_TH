package strategy_pattern;

public class CheckOrderInfo implements OrderBehavior {

    @Override
    public void execute() {
        System.out.println("Kiểm tra thông tin đơn hàng.");
    }
}
