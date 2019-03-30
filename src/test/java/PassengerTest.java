import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {


    Passenger passenger;
    Ticket ticket;
    Airport airport;
    Flight flight;
    Plane plane1;

    @Before
    public void before() {
        this.passenger = new Passenger("Johny Walker");
        this.flight = new Flight (plane1, 34, "Chicago");
        this.airport = new Airport(AirportCode.EDI);
    }
    @Test
    public void haveName() {
        assertEquals("Johny Walker", passenger.getName());
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
//    @Test
//    public void canBuyTicket() {
//        Ticket newTicket = airport.sellTicket(passenger, flight);
//        passenger.addTicket(newTicket);
//        passenger.addTicket(newTicket);
//        assertEquals(2, passenger.getTickets());
//    }
}
