package example1;

public class DeliveredState implements PackageState {

    @Override
    public void previousPackageState(Package pkg) {
        pkg.setState(new OutForDeliveryState());
    }

    @Override
    public void nextPackageState(Package pkg) {
        System.out.println("Package delivered!!");
    }

    @Override
    public void printStatus() {
        System.out.println("Package has been delivered!");
    }
}