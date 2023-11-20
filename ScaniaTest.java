import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ScaniaTest {
    @Test
    public void testgetCurrentSpeed() {
        Scania scaniatest = new Scania(Direction.WEST, 0,0);
        assertEquals(0, scaniatest.getCurrentSpeed(), 0);
    }

    @Test
    public void testScaniaPlatformAngle() {
        Scania scaniatest = new Scania(Direction.WEST, 0,0);

        scaniatest.lowerPlatform();
        assertEquals(false, scaniatest.getPlatformAngle());

        scaniatest.raisePlatform();
        assertEquals(true, scaniatest.getPlatformAngle());

    }


    @Test
    public void testScaniaMoveUp() {
        Scania scaniatest = new Scania(Direction.SOUTH, 0, 0);
        scaniatest.raisePlatform();

        scaniatest.startEngine();
        scaniatest.move();

        assertEquals(0, scaniatest.getY(), 0);
    }

    @Test
    public void testScaniaMoveDown() {
        Scania scaniatest = new Scania(Direction.SOUTH, 0, 50);
        scaniatest.lowerPlatform();

        scaniatest.startEngine();
        scaniatest.move();


        assertEquals(50.1, scaniatest.getY(), 0);
    }

}
