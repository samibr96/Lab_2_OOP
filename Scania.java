import java.awt.*;

public class Scania extends Truck {

    public Scania(Direction direction, double x, double y) {
        super("Scania", 2, 4, 0, Color.RED, Direction.SOUTH , x, y, true);
    }

    public boolean getPlatformAngle() {
        return super.isRampUp();
    }

    public void raisePlatform() {
        super.raiseRamp();
    }

    public void lowerPlatform() {
        super.lowerRamp();
    }

    public double speedFactor() {
        return getEnginePower() * 0.01;
    }


    @Override
    public void move() {
        if (getPlatformAngle() == false) {
            super.move();
        }
    }
}
