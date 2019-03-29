import org.junit.Before;

public class AirportTest {

    private Airport airport;

    @Before
    public void before() {
        this.airport = new Airport(AirportCode.GLA);

    }

}
