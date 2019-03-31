import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {


    Passenger passenger;
    Ticket ticket;
    Airport airport;
    Flight flight;
    Plane plane1, plane2, plane3, plane4;

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
    public void haveName() {
        assertEquals("John Wilson", passenger.getName());
    }
    @Test
    public void hasTicketCollection() {
        assertEquals(0, passenger.getTickets());
    }
    @Test
    public void canAddTickets() {
        passenger.addTicket(ticket);
        assertEquals(1, passenger.getTickets());

    }
    @Test
    public void canBuyTicket() {
        Ticket ticket = airport.sellTicket(flight);
        passenger.addTicket(ticket);
        passenger.addTicket(ticket);
        assertEquals(2, passenger.getTickets());
    }
}
