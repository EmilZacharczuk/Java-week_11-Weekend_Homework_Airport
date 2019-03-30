import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;
    Plane plane;
    Plane plane1, plane2, plane3;



    @Before
    public void before() {
        this.airport = new Airport(AirportCode.GLA);
        this.plane1 = new Plane(PlaneType.AIRBUS340, "British Airways");
        this.plane2 = new Plane(PlaneType.BEECHCRAFTBONANZA, "Monarch");
        this.plane3 = new Plane(PlaneType.BOEING747, "EasyJet");
        airport.addPlane(plane1);
        airport.addPlane(plane2);
        airport.addPlane(plane3);

    }
    @Test
    public void hasAirportCode () {
        assertEquals(AirportCode.GLA, airport.getAirportCode());
    }

    @Test
    public void canAddPlanesToHangar () {
        airport.addPlane(plane);
        assertEquals(4, airport.hangarSize());
    }

    @Test
    public void canRemovePlaneFromHangar () {
        airport.removePlane(0);
        assertEquals(2, airport.hangarSize());
    }

    @Test
    public void canCreateFlight () {
        Flight newFlight = airport.createFlight(plane1, 22, "Warsaw");
        assertEquals(plane1, newFlight.getPlane());
        assertEquals(22, newFlight.getFlightNumber());
        assertEquals("Warsaw", newFlight.getDestination());
    }
    @Test
    public void canFindPlane () {
        int index = airport.findPlane(plane1);
        assertEquals(0, index);
        int index2 = airport.findPlane(plane2);
        assertEquals(1, index2);
     }
     @Test
    public void canRemovePlaneByPlaneType() {
         assertEquals(plane3, airport.removePlaneFromHangarByPlain(plane3));
     }
     @Test
     public void canAssignPlaneToFlight() {
         Flight newFlight = airport.createFlight(plane, 22, "Warsaw");
         airport.assignPlaneToFlight(plane1, newFlight);
         assertEquals(plane1, newFlight.getPlane());
         Flight flight = airport.createFlight(plane, 22, "Warsaw");
         airport.assignPlaneToFlight(plane3, flight);
         assertEquals(plane3, flight.getPlane());

     }
     @Test
    public void canBookPassengerOnAFlight() {
         Passenger passenger = new Passenger("John Wilson");
         Flight newFlight = airport.createFlight(plane, 22, "Warsaw");
         airport.assignPlaneToFlight(plane1, newFlight);
         airport.bookPassenger(passenger, newFlight);
         airport.bookPassenger(passenger, newFlight);
         assertEquals(2, plane1.passengersCount());
     }
     @Test
    public void canSellTickets () {
         Flight newFlight = airport.createFlight(plane, 45, "Berlin");
         airport.assignPlaneToFlight(plane1, newFlight);
         Passenger newPassenger = new Passenger("Harry Berry");
         Ticket newTicket = airport.sellTicket(newPassenger, newFlight);
         assertEquals("Harry Berry", newTicket.getPassenger().getName());
         assertEquals("Berlin", newTicket.getFlight().getDestination());
         assertEquals(1, plane1.passengersCount());
     }

//     @Test void canBookInPassengers() {
//        Passenger newPassenger = new Passenger("Johny Bean");
//
//     }
}
