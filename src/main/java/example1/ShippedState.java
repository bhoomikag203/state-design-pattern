package example1;

public class ShippedState implements PackageState {
    @Override
    public void previousPackageState(Package pkg) {
        pkg.setState(new OrderedState());
    }

    @Override
    public void nextPackageState(Package pkg) {
        pkg.setState(new OutForDeliveryState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package shipped!");
    }
}