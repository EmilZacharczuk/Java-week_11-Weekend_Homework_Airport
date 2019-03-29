import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class TicketTest {

    Ticket ticket;
    Passenger passenger;
    Flight flight;

    @Before
    public void before() {
        this.ticket = new Ticket(passenger, flight);
    }

    @Test

    public void havePassenger () {
        assertEquals(passenger, ticket.getPassenger());
    }
    @Test

    public void haveFlight() {
        assertEquals(flight, ticket.getFlight());
    }

}
