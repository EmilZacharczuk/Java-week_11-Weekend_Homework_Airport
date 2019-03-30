

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

    public int findPlane (Plane plane) {
        return this.hangar.indexOf(plane);
    }

    public Plane removePlaneFromHangarByPlain(Plane plane) {
        Integer index = findPlane(plane);
        Plane foundPlane = removePlane(index);
        return foundPlane;
    }
    public void assignPlaneToFlight(Plane plane, Flight flight) {
        Plane planeToBeAssigned = removePlaneFromHangarByPlain(plane);
        flight.setPlane(planeToBeAssigned);
     }


}
