package example2;

public class Off implements SpeedLevel {

    @Override
    public void rotate(FanWallController fanWallController) {
        fanWallController.setLevel(new SpeedLevelOne());
    }
}