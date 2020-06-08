package example2;

import org.testng.annotations.Test;

public class FanWallControllerTest {
    @Test
    public void shouldChangeFanSpeedLevel(){
        FanWallController fanWallController = new FanWallController();
        fanWallController.printCurrentFanSpeedLevel();

        fanWallController.rotate();
        fanWallController.printCurrentFanSpeedLevel();

        fanWallController.rotate();
        fanWallController.printCurrentFanSpeedLevel();

        fanWallController.rotate();
        fanWallController.printCurrentFanSpeedLevel();

        fanWallController.rotate();
        fanWallController.printCurrentFanSpeedLevel();

        fanWallController.rotate();
        fanWallController.printCurrentFanSpeedLevel();


    }
}