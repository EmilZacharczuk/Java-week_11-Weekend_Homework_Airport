import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;

    @Before
    public void before(){
        this.flight = new Flight(plane, 22, "Edinburgh");
    }

    @Test
    public void hasFLightNumber() {
        assertEquals(22, flight.getFlightNumber());
    }

    @Test
    public void hasPlane() {
        plane = new Plane(PlaneType.PIPER,"British Airways");
        assertEquals(PlaneType.PIPER, plane.getPlaneType());
    }
    @Test
    public void hasDestination() {
        assertEquals("Edinburgh", this.flight.getDestination());
    }
}
