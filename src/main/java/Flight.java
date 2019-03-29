public class Flight {

    private Plane plane;
    private int flightNumber;
    private String destination;

    public Flight(Plane plane, int flightNumber, String destination) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public int getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

}
