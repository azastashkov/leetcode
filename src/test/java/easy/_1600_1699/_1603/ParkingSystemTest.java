package easy._1600_1699._1603;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParkingSystemTest {
    @Test
    public void test() {
        ParkingSystem parkingSystem1 = new ParkingSystem(1,1,0);

        assertTrue(parkingSystem1.addCar(ParkingSystem.BIG));

        assertTrue(parkingSystem1.addCar(ParkingSystem.MEDIUM));

        assertFalse(parkingSystem1.addCar(ParkingSystem.SMALL));

        assertFalse(parkingSystem1.addCar(ParkingSystem.BIG));

        ParkingSystem parkingSystem2 = new ParkingSystem(0,0,2);

        assertFalse(parkingSystem2.addCar(ParkingSystem.BIG));

        assertFalse(parkingSystem2.addCar(ParkingSystem.MEDIUM));

        assertTrue(parkingSystem2.addCar(ParkingSystem.SMALL));
    }
}
