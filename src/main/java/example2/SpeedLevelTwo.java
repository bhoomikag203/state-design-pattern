package example2;

public class SpeedLevelTwo implements SpeedLevel {
    @Override
    public void rotate(FanWallController fanWallController) {
        fanWallController.setLevel(new SpeedLevelThree());
    }
}