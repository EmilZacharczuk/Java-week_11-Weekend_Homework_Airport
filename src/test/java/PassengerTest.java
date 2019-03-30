import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {


    Passenger passenger;
    Ticket ticket;

    @Before
    public void before() {
        this.passenger = new Passenger("Johny Walker");
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
}
