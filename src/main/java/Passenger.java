import java.util.ArrayList;

public class Passenger {

    private String name;
    private ArrayList<Ticket> tickets;

    public Passenger(String name) {
        this.name = name;
        this.tickets = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }
    public int getTickets() {
        return this.tickets.size();
    }
    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }
}
