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
        airport.removePlane(0);
        assertEquals(2, airport.hangarSize());
    }

    @Test
    public void canCreateFlight () {
        Flight newFlight = airport.createFlight(plane, 22, "Warsaw");
        assertEquals(plane, newFlight.getPlane());
        assertEquals(22, newFlight.getFlightNumber());
        assertEquals("Warsaw", newFlight.getDestination());
    }
    @Test
    public void canFindPlane () {
        Plane plane1 = new Plane(PlaneType.AIRBUS340, "British Airways");
        Plane plane2 = new Plane(PlaneType.BEECHCRAFTBONANZA, "Monarch");
        Plane plane3 = new Plane(PlaneType.BOEING747, "EasyJet");
        airport.addPlane(plane1);
        airport.addPlane(plane2);
        airport.addPlane(plane3);
        int counter = airport.findPlaneByType(PlaneType.AIRBUS340);
        assertEquals(0, counter);
     }
     @Test
    public void canRemovePlaneByPlaneType() {
         Plane plane1 = new Plane(PlaneType.AIRBUS340, "British Airways");
         Plane plane2 = new Plane(PlaneType.BEECHCRAFTBONANZA, "Monarch");
         Plane plane3 = new Plane(PlaneType.BOEING747, "EasyJet");
         airport.addPlane(plane1);
         airport.addPlane(plane2);
         airport.addPlane(plane3);
         assertEquals(plane1, airport.removePlaneByPlaneType(PlaneType.AIRBUS340));
     }
}
