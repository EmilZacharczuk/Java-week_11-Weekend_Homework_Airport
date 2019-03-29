import org.junit.Before;

public class FlightTest {

    Flight flight;
    Plane plane;

    @Before
    private void before(){
        this.flight = new Flight(plane, 22, "Edinburgh");
    }
}
