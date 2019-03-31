import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;
    Plane plane;
    Plane plane1, plane2, plane3, plane4;
    Passenger passenger;
    Flight flight;


    @Before
    public void before() {
        this.airport = new Airport(AirportCode.GLA);
        this.plane1 = new Plane(PlaneType.AIRBUS340, "British Airways");
        this.plane2 = new Plane(PlaneType.BEECHCRAFTBONANZA, "Monarch");
        this.plane3 = new Plane(PlaneType.BOEING747, "EasyJet");
        this.plane4 = new Plane(PlaneType.PIPER, "Monarch");
        airport.addPlane(plane1);
        airport.addPlane(plane2);
        airport.addPlane(plane3);
        airport.addPlane(plane4);
        this.passenger = new Passenger("John Wilson");
        this.flight = airport.createFlight(plane1, 22, "Warsaw");

    }
    @Test
    public void hasAirportCode () {
        assertEquals(AirportCode.GLA, airport.getAirportCode());
    }

    @Test
    public void canAddPlanesToHangar () {
        airport.addPlane(plane);
        assertEquals(5, airport.hangarSize());
    }

    @Test
    public void canRemovePlaneFromHangar () {
        airport.removePlane(0);
        assertEquals(3, airport.hangarSize());
    }

    @Test
    public void canCreateFlight () {

        assertEquals(plane1, flight.getPlane());
        assertEquals(22, flight.getFlightNumber());
        assertEquals("Warsaw", flight.getDestination());
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
         assertEquals(plane1, flight.getPlane());
         Flight flight = airport.createFlight(plane, 22, "Warsaw");
         airport.assignPlaneToFlight(plane3, flight);
         assertEquals(plane3, flight.getPlane());

     }
     @Test
    public void canBookPassengerOnAFlight() {
         airport.assignPlaneToFlight(plane1, flight);
         airport.sellTicket(flight);
         passenger.buyTicket(airport, flight);
         airport.bookPassenger(passenger, flight);
         airport.sellTicket(flight);
         passenger.buyTicket(airport, flight);
         airport.bookPassenger(passenger, flight);
         assertEquals(2, plane1.passengersCount());
     }
     @Test
    public void canCreateTickets () {
         airport.assignPlaneToFlight(plane1, flight);
         Ticket newTicket = airport.sellTicket(flight);
         Ticket newTicket2 = airport.sellTicket(flight);
         assertEquals("Warsaw", newTicket.getFlight().getDestination());

     }

     @Test
    public void canSellTicketToPassenger() {
         airport.assignPlaneToFlight(plane1, flight);
         Ticket newTicket = airport.sellTicket(flight);
         passenger.buyTicket(airport, flight);
         Ticket newTicket2 = airport.sellTicket(flight);
         passenger.buyTicket(airport, flight);
         assertEquals(2, passenger.getTickets());
     }
    @Test
    public void canCheckHowManyPassengersForEachFlight() {
        airport.assignPlaneToFlight(plane1, flight);
        Ticket newTicket = airport.sellTicket(flight);
        airport.bookPassenger(passenger, flight);
        Ticket newTicket2 = airport.sellTicket(flight);
        airport.bookPassenger(passenger, flight);
        int bookings = airport.findBookings(flight);
        Passenger passenger1 = new Passenger("Harry Potter");
        Flight flight1 = new Flight (plane2, 22, "Rome");
        airport.assignPlaneToFlight(plane2, flight1);
        Ticket newTicket3 = airport.sellTicket(flight1);
        airport.bookPassenger(passenger1, flight1);
        Ticket newTicket4 = airport.sellTicket(flight1);
        airport.bookPassenger(passenger1, flight1);
        Ticket newTicket5 = airport.sellTicket(flight1);
        airport.bookPassenger(passenger1, flight1);
        Ticket newTicket6 = airport.sellTicket(flight1);
        airport.bookPassenger(passenger1, flight1);
        int bookings2 = airport.findBookings(flight1);
        assertEquals(2, bookings);
        assertEquals(4, bookings2);
    }

    @Test
    public void cannotOverbookFlight() {
        airport.assignPlaneToFlight(plane4, flight);
        Ticket newTicket = airport.sellTicket(flight);
        passenger.buyTicket(airport, flight);
        airport.bookPassenger(passenger, flight);
        Ticket newTicket1 = airport.sellTicket(flight);
        passenger.buyTicket(airport, flight);
        airport.bookPassenger(passenger, flight);
        Ticket newTicket2 = airport.sellTicket(flight);
        passenger.buyTicket(airport, flight);
        airport.bookPassenger(passenger, flight);
        Ticket newTicket3 = airport.sellTicket(flight);
        passenger.buyTicket(airport, flight);
        airport.bookPassenger(passenger, flight);
        Ticket newTicket4 = airport.sellTicket(flight);
        passenger.buyTicket(airport, flight);
        airport.bookPassenger(passenger, flight);
        Ticket newTicket5 = airport.sellTicket(flight);
        passenger.buyTicket(airport, flight);
        airport.bookPassenger(passenger, flight);
        Ticket newTicket6 = airport.sellTicket(flight);
        passenger.buyTicket(airport, flight);
        airport.bookPassenger(passenger, flight);
        Ticket newTicket7 = airport.sellTicket(flight);
        passenger.buyTicket(airport, flight);
        airport.bookPassenger(passenger, flight);
        int bookings = airport.findBookings(flight);
        assertEquals(6, bookings);
        assertEquals(6, passenger.getTickets());

    }

}
