package strategy_pattern;

public class PackageAndShip implements OrderBehavior {
    @Override
    public void execute() {
        System.out.println("Đóng gói và vận chuyển.");
    }
}
