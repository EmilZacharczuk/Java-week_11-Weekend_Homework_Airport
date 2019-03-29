

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

    public Plane removePlane(int index) {
        return this.hangar.remove(index);
    }
    public Flight createFlight(Plane plane, int flightNumber, String destination) {
        Flight flight = new Flight(plane, flightNumber, destination);
        return flight;
    }

    public int findPlaneByType (PlaneType planeType) {
        Plane foundPlane = null;
        int counter = 0;
        for (Plane plane : hangar) {
            if (plane.getPlaneType() == planeType) {
                counter += 1;
            }
        }
        return counter - 1;
    }

    public Plane removePlaneByPlaneType(PlaneType planeType) {
        Integer index = findPlaneByType(planeType);
        Plane foundPlane = removePlane(index);
        return foundPlane;
    }

}
