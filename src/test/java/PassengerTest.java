import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {


    Passenger passenger;

    @Before
    public void before() {
        this.passenger = new Passenger("Johny Walker");
    }
    @Test
    public void haveName() {
        assertEquals("Johny Walker", passenger.getName());
    }
}
