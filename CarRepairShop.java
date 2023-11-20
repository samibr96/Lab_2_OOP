import java.util.ArrayList;
import java.util.List;

public class CarRepairShop {

    private List<Vehicle> cars;
    public double x;
    public double y;
    private int maxNrOfCas;

    public CarRepairShop(int maxAmountOfCars, double x, double y) {

        cars = new ArrayList<>();
        this.maxNrOfCas = maxAmountOfCars;
        this.x = x;
        this.y = y;
    }

    public boolean isWorkShopFull() {
        return cars.size() >= maxNrOfCas;
    }

    public void carload (Vehicle car)
    {
        if(cars.size() < maxNrOfCas){
            cars.add(car);
        }
    }

    public void carUnload (Vehicle car)
    {
        cars.remove(car);
    }
}
