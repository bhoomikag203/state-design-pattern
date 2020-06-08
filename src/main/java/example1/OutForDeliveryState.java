package example1;

public class OutForDeliveryState implements PackageState {
    @Override
    public void previousPackageState(Package pkg) {
        pkg.setState(new ShippedState());
    }

    @Override
    public void nextPackageState(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package out for delivery!");
    }
}