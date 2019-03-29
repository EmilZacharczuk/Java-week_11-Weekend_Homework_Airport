import java.util.ArrayList;

public class Airport {

    private AirportCode airportCode;
    private ArrayList<Plane> hangar;

    public Airport(AirportCode airportCode) {
        this.airportCode = airportCode;
        this.hangar = new ArrayList<>();
    }

    public AirportCode getAirportCode() {
        return airportCode;
    }

    public int hangarSize() {
        return this.hangar.size();
    }

    public void addPlane(Plane plane) {
        this.hangar.add(plane);
    }

    public Plane removePlane() {
        return this.hangar.remove(0);
    }
}
