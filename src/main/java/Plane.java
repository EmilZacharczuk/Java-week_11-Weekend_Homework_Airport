import java.util.ArrayList;

public class Plane {

    private PlaneType planeType;
    private String airline;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType planeType, String airline) {
        this.planeType = planeType;
        this.airline = airline;
        this.passengers = new ArrayList<Passenger>();
    }
}
