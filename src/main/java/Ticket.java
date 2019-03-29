public class Ticket {

    private Passenger passenger;
    private Flight flight;



    public Ticket(Passenger passenger, Flight flight){
        this.passenger = passenger;
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return this.passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }
}
