import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;
    Passenger passenger;

    @Before
    public void before() {
        this.plane = new Plane(PlaneType.PIPER, "EasyJet");
        this.passenger = new Passenger("Johny Walker");
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
        plane.addPassenger(passenger);
        assertEquals(1, this.plane.passengersCount());
    }
    @Test
    public void canHavePassengers() {
        assertEquals(0, this.plane.passengersCount());
    }
    @Test
    public void canRemovePassengers() {
        plane.addPassenger(passenger);
        plane.addPassenger(passenger);
        plane.removePassenger();
        assertEquals(1, this.plane.passengersCount());
    }
    @Test
    public void hasCapacity() {
        plane.getPlaneCapacity();
    }

    @Test
    public void isFull () {
        for (int i = 0; i < 4 ; i++) {
            plane.addPassenger(passenger);
        }
        assertEquals(false, plane.isFull());
    }

    @Test
    public void isNotFull () {
        for (int i = 0; i < plane.getPlaneCapacity() ; i++) {
            plane.addPassenger(passenger);
        }
        assertEquals(true, plane.isFull());
    }
}
