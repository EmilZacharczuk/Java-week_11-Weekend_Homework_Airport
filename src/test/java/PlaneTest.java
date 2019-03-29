import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;
    Passenger passenger;

    @Before
    public void before() {
        this.plane = new Plane(PlaneType.PIPER, "EasyJet");
    }

    @Test
    public void haveType() {
        assertEquals(PlaneType.PIPER, plane.getPlaneType());
    }

    @Test
    public void haveAirline() {
        assertEquals("EasyJet", plane.getAirline());
    }

    @Test
    public void canAddPassengers() {
        passenger = new Passenger("Johny Walker");
        plane.addPassenger(passenger);
        assertEquals(1, this.plane.passengersCount());
    }
    @Test
    public void canHavePassengers() {
        assertEquals(0, this.plane.passengersCount());
    }
    @Test
    public void canRemovePassengers() {
        passenger = new Passenger("Johny Walker");
        plane.addPassenger(passenger);
        plane.addPassenger(passenger);
        plane.removePassenger();
        assertEquals(1, this.plane.passengersCount());
    }

}
