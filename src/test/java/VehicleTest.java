import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void demo() {
        Car car = new Car();
        Vehicle truck = new Truck();

        assertEquals("Bee...eeep", car.honk());
        assertEquals("BIG BEEP", truck.honk());
    }
}

