package example1;


import lombok.Getter;
import lombok.Setter;

public class Package {
    @Getter
    @Setter
    private PackageState state;

    public Package() {
        System.out.println("Place order!!");
        this.state = new OrderedState();
    }

    public void nextState() {
        state.nextPackageState(this);
    }

    public void printStatus() {
        state.printStatus();
    }

    public void previousState() {
        state.previousPackageState(this);
    }

}