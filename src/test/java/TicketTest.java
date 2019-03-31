import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class TicketTest {

    Ticket ticket;
    Flight flight;

    @Before
    public void before() {
        this.ticket = new Ticket(flight);
    }


    @Test

    public void haveFlight() {
        assertEquals(flight, ticket.getFlight());
    }

}
