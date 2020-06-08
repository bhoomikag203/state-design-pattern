package example2;

public class SpeedLevelThree implements SpeedLevel {
    @Override
    public void rotate(FanWallController fanWallController) {
        fanWallController.setLevel(new Off());
    }
}