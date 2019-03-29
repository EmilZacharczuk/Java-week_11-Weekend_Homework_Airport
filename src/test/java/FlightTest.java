import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;

    @Before
    public void before(){
        this.plane = new Plane(PlaneType.AIRBUS340, "British Airways");
        this.flight = new Flight(plane, 22, "Edinburgh");

    }

    @Test
    public void hasFLightNumber() {
        assertEquals(22, flight.getFlightNumber());
    }

    @Test
    public void hasPlane() {
        assertEquals(plane, flight.getPlane());

    }
    @Test
    public void hasDestination() {
        assertEquals("Edinburgh", flight.getDestination());
    }

}
