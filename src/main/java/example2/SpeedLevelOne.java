package example2;

public class SpeedLevelOne implements SpeedLevel {
    @Override
    public void rotate(FanWallController fanWallController) {
        fanWallController.setLevel(new SpeedLevelTwo());
    }
}