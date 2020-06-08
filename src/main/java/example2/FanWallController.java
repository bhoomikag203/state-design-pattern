package example2;

public class FanWallController {
    private SpeedLevel currentLevel;

    public FanWallController() {
        this.currentLevel = new Off();
    }

    public void setLevel(SpeedLevel speedLevel) {
        this.currentLevel = speedLevel;
    }

    public void rotate() {
        this.currentLevel.rotate(this);
    }

    public void printCurrentFanSpeedLevel(){
        System.out.println("Current speed level = "+ this.currentLevel.getClass().getName());
    }
}