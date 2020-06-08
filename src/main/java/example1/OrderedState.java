package example1;

public class OrderedState implements PackageState{

    @Override
    public void previousPackageState(Package pkg) {
        System.out.println("Please place order!");
    }

    @Override
    public void nextPackageState(Package pkg) {
        pkg.setState(new ShippedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package ordered!");
    }
}