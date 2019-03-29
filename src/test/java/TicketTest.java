import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicketTest {

    private Ticket ticket;
    private Passenger passenger;
    private Flight flight;

    @Before
    public void before() {
        this.ticket = new Ticket(passenger, flight);
//        this.flight = new Flight(plane, 22, "Frankfurt" );

    }

    @Test

    public void havePassenger() {
        passenger = new Passenger("Johny Walker");
        assertEquals(passenger ,ticket.getPassenger());
    }


}
