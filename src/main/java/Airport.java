import java.util.ArrayList;

public class Airport {

    private AirportCode airportCode;
    private ArrayList<Plane> hangar;

    public Airport(AirportCode airportCode) {
        this.airportCode = airportCode;
        this.hangar = new ArrayList<>();
    }

}
