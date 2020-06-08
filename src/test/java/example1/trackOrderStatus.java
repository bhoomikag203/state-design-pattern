package example1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class trackOrderStatus {
    @Test
    public void shouldCheckOrderStatus() {
        Package pkg = new Package();

        pkg.printStatus();
        Assert.assertTrue(pkg.getState() instanceof OrderedState);

        pkg.nextState();
        pkg.printStatus();
        Assert.assertTrue(pkg.getState() instanceof ShippedState);

        pkg.nextState();
        pkg.printStatus();
        Assert.assertTrue(pkg.getState() instanceof OutForDeliveryState);

        pkg.nextState();
        pkg.printStatus();
        pkg.nextState();
        Assert.assertTrue(pkg.getState() instanceof DeliveredState);

    }

}