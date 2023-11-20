import java.awt.*;

public abstract class Truck extends Vehicle {

    private boolean platformUp;

    public Truck(String modelName, int nrDoors, double enginePower, double currentSpeed, Color color, Direction direction , double x, double y, boolean liftBed) {
        super(modelName, nrDoors, enginePower, currentSpeed, color, direction , x, y);
        this.platformUp = true;
    }

    public void raiseRamp() {
        if (getCurrentSpeed() == 0) {
            platformUp = true;
        }
    }

    public void lowerRamp() {
        if (getCurrentSpeed() == 0) {
            platformUp = false;
        }
    }

    public boolean isRampUp() {
        return platformUp;
    }

    public void move() {
        if (platformUp) {
            super.move();
        }
    }
}
