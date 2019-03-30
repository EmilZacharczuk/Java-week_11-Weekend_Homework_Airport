import java.util.ArrayList;

public class Plane {

    private PlaneType planeType;
    private String airline;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType planeType, String airline) {
        this.planeType = planeType;
        this.airline = airline;
        this.passengers = new ArrayList<>();
    }

    public PlaneType getPlaneType() {
        return this.planeType;
    }

    public String getAirline() {
        return this.airline;
    }
    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public int passengersCount() {
        return this.passengers.size();
    }
    public Passenger removePassenger() {
        return this.passengers.remove(0);
    }

    public int getPlaneCapacity () {
        return this.planeType.returnValue();
    }
    public boolean isFull() {
        if (getPlaneCapacity() == passengersCount())  {
            return true;
        } else {
            return false;
        }
    }
    }
