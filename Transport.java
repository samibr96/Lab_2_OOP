import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Transport extends Truck {

    private List<Vehicle> cars;
    public double x;
    public double y;
    private final int maxCars = 5;

    public Transport(Direction direction, double x, double y) {
        super("Truck D50SE-5", 2, 300, 2, Color.ORANGE, direction , x, y, false);

        this.cars = new ArrayList<>();
    }

    public List<Vehicle> getCars() {
        return cars;
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


    public void loadCar(Vehicle car) {
        if (!isRampUp()) {
            // 3.
            double variableX = car.getX();
            double variableY = car.getY();
            if (this.x - 10 < variableX && variableX < this.x + 10 &&
                    this.y - 10 < variableY && variableY < this.y + 10 &&
                    car.getCurrentSpeed() == 0) {
                cars.add(car);
            }
        }

        // 6. The car transport must not be able to be loaded onto itself.
        if (cars.contains(this)) {
            cars.remove(this);
        }
    }

    public void unloadCar(Vehicle car)
    {
        if (!isRampUp()) {
            // 5. Cars must be unloaded in reverse order from how they were loaded.

            if (!cars.isEmpty()) {
                Vehicle lastCar = cars.get(cars.size() - 1);

                double variableX = car.getX();
                double variableY = car.getY();

                if (getX() - 10 < variableX && variableX < getX() + 10 &&
                        getY() - 10 < variableY && variableY < getY() + 10 &&
                        lastCar.getCurrentSpeed() == 0) {

                    cars.remove(cars.size() - 1);
                }
            }
        }
    }

    @Override
    public void move() {
            super.move();
            for (Vehicle car : cars) {
                car.setX(getX());
                car.setY(getY());
            }
    }

    @Override
    protected double speedFactor() {
        return 0;
    }

}
