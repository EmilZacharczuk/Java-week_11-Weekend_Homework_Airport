import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;
    Plane plane;


    @Before
    public void before() {
        this.airport = new Airport(AirportCode.GLA);

    }
    @Test
    public void hasAirportCode () {
        assertEquals(AirportCode.GLA, airport.getAirportCode());
    }

    @Test
    public void hasHangar () {
        assertEquals(0, airport.hangarSize());
    }

    @Test
    public void canAddPlanesToHangar () {
        airport.addPlane(plane);
        assertEquals(1, airport.hangarSize());
    }

    @Test
    public void canRemovePlaneFromHangar () {
        airport.addPlane(plane);
        airport.addPlane(plane);
        airport.addPlane(plane);
        airport.removePlane();
        assertEquals(2, airport.hangarSize());
    }

}
