public class Ticket {


    private Flight flight;



    public Ticket(Flight flight){
        this.flight = flight;
    }


    public Flight getFlight() {
        return this.flight;
    }
}
