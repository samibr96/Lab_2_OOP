import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarRepairShopTest {

    @Test
    public void testIsWorkshopFull() {
        CarRepairShop<Vehicle> carRepairShop = new CarRepairShop<>(2, 0, 0);

        Volvo240 volvo240 = new Volvo240(Direction.SOUTH, 0, 0);

        assertEquals(false,carRepairShop.isWorkShopFull());

        Saab95 saab95 = new Saab95(Direction.WEST, 0, 0);

        carRepairShop.carload(volvo240);
        carRepairShop.carload(saab95);

        assertEquals(true,carRepairShop.isWorkShopFull());
    }

    @Test
    public void testCarLoad() {
        CarRepairShop<Vehicle> carRepairShop = new CarRepairShop<>(2, 0, 0);

        Volvo240 volvo240 = new Volvo240(Direction.SOUTH, 0, 0);
        Saab95 saab95 = new Saab95(Direction.WEST, 0, 0);

        carRepairShop.carload(volvo240);
        carRepairShop.carload(saab95);

        assertEquals(2, carRepairShop.getCars().size());
        assertEquals(volvo240, carRepairShop.getCars().get(0));
        assertEquals(saab95, carRepairShop.getCars().get(1));

    }

    @Test
    public void testUnloadCar() {
        CarRepairShop<Vehicle> carRepairShop = new CarRepairShop<>(2, 0, 0);

        Volvo240 volvo240 = new Volvo240(Direction.SOUTH, 0, 0);
        Saab95 saab95 = new Saab95(Direction.WEST, 0, 0);



        carRepairShop.carload(volvo240);
        carRepairShop.carload(saab95);

        carRepairShop.carUnload(saab95);

        assertEquals(volvo240, carRepairShop.getCars().get(0));
        assertEquals(1, carRepairShop.getCars().size());

    }
}
