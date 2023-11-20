import java.awt.*;


public class Saab95 extends Vehicle

{
    private Turbo turbo;

    public Saab95(Direction direction , double x, double y) {
        super("Saab95", 10, 4, 0, Color.BLUE, Direction.SOUTH  , x, y);

    }
    public boolean isTurboOn() {

        return turbo.isTurboOn();
    }

    public void setTurboOn() {
        turbo.setTurboOn();
    }

    public void setTurboOff() {

        turbo.setTurboOff();
    }

    public double speedFactor() {
        double turboFactor = 1;
        if (isTurboOn()) turboFactor = 1.3;
        return getEnginePower() * 0.01 * turboFactor;
    }
}